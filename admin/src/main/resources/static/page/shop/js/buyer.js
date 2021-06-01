layui.use(['table','form'], function () {
    var table = layui.table;
    var $ = layui.jquery;
    var form = layui.form
        ,layer = layui.layer
        ,layedit = layui.layedit
        ,laydate = layui.laydate;

    form.render();

    form.on('submit(serchBtn)', function(data) {
        table.reload('goods_table', {
            method: 'get',
            where: {
                countryName: data.field.countryName,
                typeName: data.field.typeName,
                // keyword: data.field.keyword,
                priceBegin: data.field.priceBegin,
                priceEnd: data.field.priceEnd,
                // shop: data.field.shop,
                // category: data.field.category,
                // taskCount: data.field.taskCount,
                asin:data.field.asin
            },
            page: {
                curr: 1
            }
        });
        return false;
    })



    function tableReload(){
        table.reload('goods_table', {
            method: 'get',
            // where: {
            //
            // },
            page: {
                curr: 1
            }
        });

    }

    table.render({
        elem: '#goods_table',
        id:'goods_table',
        url: '/buyer/list',
        method: 'get',
        toolbar: '#toolbarDemo',
        cols: [[
            {field: 'buyerId', title: '任务号'},
            {field: 'name', title: '姓名', sort: true},
            {field: 'countryName', title: '国家', sort: true},
            {field: 'level',  title: '等级', align: 'center'},
            {field: 'imgCommission', title: '图片佣金', align: 'center'},
            {field: 'wordCommission',  title: '文字佣金', sort: true, align: 'center'},
            {field: 'videoCommission', title: '视频佣金', align: 'center'},
            {field: 'contactDetails', title: '联系方式', align: 'center'},
        ]]
            ,
        page: true,
        limits: [5, 10, 20, 50],
        limit: 5,
        loading: true,
        count: 1000,
        parseData: function (res) {
            return {
                "code": res.code,
                "msg": res.msg,
                "count": res.total,
                "data": res.data
            };
        },
        request: {
            pageName: 'page',
            limitName: 'limit'
        },
    });


    table.on('toolbar(goods_table)', function (obj) {
        var data = obj.data;
        if (obj.event === 'del') {
            layer.confirm('确定删除当前商品?', function (index) {
                $.ajax({
                    url: '/goods/delGoods',
                    type: 'get',
                    dataType: 'json',
                    data: {'goods_id': data.goodsId},
                    success: function (suc) {
                        if (suc.code == 0) {
                            obj.del();
                            layer.close(index);
                            layer.msg(suc.msg, {icon: 1});
                        } else {
                            layer.msg(suc.msg, {icon: 5});
                        }
                    }
                });
            });
        } else if (obj.event === 'add') {
            console.log(111111111111111111111111111111111);
            var index = layer.open({
                type:2,
                title:'增加商品',
                area : ['1000px' , '800px'],
                shadeClose:true,
                content: "taskDetail.html"
            });
            // layer.full(index);
        } else if (obj.event === 'checkGoodsDetail') {
            var index = layer.open({
                type: 1,
                title: '查看商品详情',
                area: ['auto', '800px'],
                // maxmin: true,
                shadeClose: true,
                content: obj.data.goodsDetail,
            });
        } else if (obj.event === 'checkGoodsPicDetail') {
            console.log(data.goodsGallery);
            var jsonResult  = $.parseJSON(data.goodsGallery);
            console.log(jsonResult);
            layer.photos({
                photos: jsonResult,
                anim: 5
            });
        }else if(obj.event=='recommend'){//修改商品为热门推荐商品
            $.ajax({
                url: '/goods/updateGoods',
                type: 'get',
                dataType: 'json',
                data: {'goods_id': data.goodsId,'goods_nature':3},
                success: function (suc) {
                    if(suc.code=='0'){
                        tableReload();
                        layer.msg("商品推荐成功", {icon: 1});
                    }
                }
            })

        }else if(obj.event=='unrecommend'){//修改商品为热门推荐商品
            $.ajax({
                url: '/goods/updateGoods',
                type: 'get',
                dataType: 'json',
                data: {'goods_id': data.goodsId,'goods_nature':1},
                success: function (suc) {
                    if(suc.code=='0'){
                        tableReload();
                        layer.msg("商品取消推荐成功", {icon: 1});

                    }
                }
            })

        }else if(obj.event=='mass'){//修改商品为热门推荐商品
            $.ajax({
                url: '/goods/updateGoods',
                type: 'get',
                dataType: 'json',
                data: {'goods_id': data.goodsId,'goods_nature':2},
                success: function (suc) {
                    if(suc.code=='0'){
                        tableReload();
                        layer.msg("推荐拼团成功", {icon: 1});

                    }
                }
            })

        }else if(obj.event=='unmass'){//修改商品为热门推荐商品
            $.ajax({
                url: '/goods/updateGoods',
                type: 'get',
                dataType: 'json',
                data: {'goods_id': data.goodsId,'goods_nature':1},
                success: function (suc) {
                    if(suc.code=='0'){
                        tableReload();
                        layer.msg("取消推荐拼团成功", {icon: 1});

                    }
                }
            })
        }else if(obj.event=='disSale'){//修改商品下架
            $.ajax({
                url: '/goods/updateGoods',
                type: 'get',
                dataType: 'json',
                data: {'goods_id': data.goodsId,'is_on_sale':false},
                success: function (suc) {
                    if(suc.code=='0'){
                        tableReload();
                        layer.msg("下架成功", {icon: 1});
                    }
                }
            })

        }else if(obj.event=='upSale'){//修改商品为上架
            $.ajax({
                url: '/goods/updateGoods',
                type: 'get',
                dataType: 'json',
                data: {'goods_id': data.goodsId,'is_on_sale':true},
                success: function (suc) {
                    if(suc.code=='0'){
                        tableReload();
                        layer.msg("下架成功", {icon: 1});
                    }
                }
            })

        }

    });
})

$.ajax({
    url: '/country/list',
    dataType: 'json',
    type: 'get',
    success: function (data) {
        console.log(data)
        $.each(data.data, function (index, item) {
            $('#country').append(new Option(item.countryName, item.countryId));// 下拉菜单里添加元素
        });
        layui.form.render("select");
//重新渲染 固定写法
    }
})

$.ajax({
    url: '/type/list',
    dataType: 'json',
    type: 'get',
    success: function (data) {
        $.each(data.data, function (index, item) {
            $('#type').append(new Option(item.typeName, item.typeId));// 下拉菜单里添加元素
        });
        layui.form.render("select");
//重新渲染 固定写法
    }
})





function addGoods() {
    console.log(123)
    //console 打印了  msg 不弹出  open 不弹出  试试
    layer.msg("xxx")

}

function showImg(url) {
    layer.open({
        type: 1,
        title: false,
        closeBtn: 0,
        area: ['auto'],
        skin: 'layui-layer-nobg',
        shadeClose: true,
        content: "<img src='/upload/shop/" + url + "'>"
    });
}

function createTime(v) {
    var date = new Date(v);
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    m = m < 10 ? '0' + m : m;
    var d = date.getDate();
    d = d < 10 ? ("0" + d) : d;
    var h = date.getHours();
    h = h < 10 ? ("0" + h) : h;
    var M = date.getMinutes();
    M = M < 10 ? ("0" + M) : M;
    var str = y + "-" + m + "-" + d + " " + h + ":" + M;
    return str;
}

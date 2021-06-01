layui.use(['table','form'], function () {
    var table = layui.table;
    var $ = layui.jquery;
    var form = layui.form
        ,layer = layui.layer
        ,layedit = layui.layedit
        ,laydate = layui.laydate;

    form.render();

    init();

    form.on('submit(serchBtn)', function(data) {
        table.reload('goods_table', {
            method: 'get',
            where: {
                countryName: data.field.countryName,
                typeName: data.field.typeName,
                priceBegin: data.field.priceBegin,
                priceEnd: data.field.priceEnd,
                asin:data.field.asin
            },
            page: {
                curr: 1
            }
        });
        init();
        return false;
    })

    function tableReload(){
        table.reload('goods_table', {
            method: 'get',
            page: {
                curr: 1
            }
        });
    }

    table.render({
        elem: '#goods_table',
        id:'goods_table',
        url: '/task/list',
        method: 'get',
        toolbar: '#toolbarDemo',
        cols: [[
            {field: 'taskId', title: '任务号'},
            {field: 'shopName', title: '商户', sort: true},
            {field: 'countryName', title: '国家', sort: true},
            {field: 'asin',  title: 'ASIN', align: 'center'},
            {field: 'img', title: '图片',  toolbar: '#checkGoodsPicDetail', align: 'center'},
            {field: 'typeName',  title: '类目', sort: true, align: 'center'},
            {field: 'keyword',  title: '关键词', align: 'center'},
            {field: 'price',  title: '价格', sort: true, align: 'center'},
            {field: 'shop', title: '店铺', align: 'center'},
            {field: 'category',  title: '类型', align: 'center'},
            {field: 'taskCount', title: '个数', align: 'center'},
            {field: 'sumPrincipal', title: '总本金', align: 'center'},
            {field: 'sumCommission', title: '总佣金', align: 'center'},
            {field: 'total', title: '合计', align: 'center'},
        ]],
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
        if (obj.event === 'add') {
            var index = layer.open({
                type:2,
                title:'增加商品',
                area : ['1000px' , '800px'],
                shadeClose:true,
                content: "taskDetail.html"
            });
            // layer.full(index);
        }
    });

    function init() {
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
            }
        })
    }

})

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

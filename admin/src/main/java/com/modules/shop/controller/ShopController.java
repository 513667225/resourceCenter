package com.modules.shop.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.modules.shop.entity.ShopEntity;
import com.modules.shop.service.IShopService;
import com.yph.annotation.Pmap;
import com.yph.util.P;
import com.yph.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
@RestController
@RequestMapping("/shop")
public class ShopController {


    @Autowired
    IShopService shopService;

    @RequestMapping("/list")
    public R list(@Pmap  P p ){
        Page tPage = new Page(p.getInt("page"), p.getInt("limit"));
        p.removePageParam();
        shopService.page(tPage, new QueryWrapper<ShopEntity>().allEq(p));
        return R.success().data(tPage.getRecords()).set("count",tPage.getTotal());
    }




}

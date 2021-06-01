package com.modules.buyer.controller;


import com.modules.buyer.service.IBuyerService;
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
@RequestMapping("/buyer")
public class BuyerController {


    @Autowired
    IBuyerService buyerService;

    @RequestMapping("/list")
    public R list(@Pmap P p ){
        return buyerService.listPage(p);
    }


}

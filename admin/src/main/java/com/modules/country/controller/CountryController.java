package com.modules.country.controller;


import com.modules.country.service.ICountryService;
import com.yph.redis.service.RedisService;
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
@RequestMapping("/country")
public class CountryController {


    @Autowired
    ICountryService iCountryService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/list")
    public R list(){

        return R.success("success",iCountryService.list());
    }




}

package com.modules.type.controller;


import com.modules.type.service.ITypeService;
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
@RequestMapping("/type")
public class TypeController {


    @Autowired
    ITypeService typeService;

    @RequestMapping("/list")
    public R list(){

        return R.success().data(typeService.list());
    }

}

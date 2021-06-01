package com.modules.task.controller;


import com.modules.task.entity.TaskEntity;
import com.modules.task.service.ITaskService;
import com.yph.annotation.Pmap;
import com.yph.util.P;
import com.yph.util.R;
import com.yph.util.utli.ValidateUtli;
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
@RequestMapping("/task")
public class TaskController {


    @Autowired
    ITaskService taskService;

    @RequestMapping("/list")
    public R list(@Pmap P p){

        return taskService.listTask(p);
    }


    @RequestMapping("/insert")
    public  R  insert(@Pmap P p) throws Exception{
        ValidateUtli.validateParams(p,"countryId","asin","img","typeId","keyword","price","shop","category","taskCount");
        taskService.save(p.thisToEntity(TaskEntity.class));
        return R.success();
    }




}

package com.modules.task.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modules.task.entity.TaskEntity;
import com.yph.util.P;
import com.yph.util.R;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
public interface ITaskService extends IService<TaskEntity> {

    R listTask(P p);


}

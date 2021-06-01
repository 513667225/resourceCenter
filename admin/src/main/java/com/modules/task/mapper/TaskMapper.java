package com.modules.task.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.modules.task.entity.TaskEntity;
import com.yph.util.P;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author
 * @since 2021-05-31
 */
public interface TaskMapper extends BaseMapper<TaskEntity> {

    List<Map<String,Object>> queryTask(P p);

    Integer queryTaskCount(P p);

}

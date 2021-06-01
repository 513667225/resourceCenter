package com.modules.type.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.type.entity.TypeEntity;
import com.modules.type.mapper.TypeMapper;
import com.modules.type.service.ITypeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, TypeEntity> implements ITypeService {

}

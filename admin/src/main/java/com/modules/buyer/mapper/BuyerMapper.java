package com.modules.buyer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.modules.buyer.entity.BuyerEntity;
import com.yph.util.P;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
public interface BuyerMapper extends BaseMapper<BuyerEntity> {

    List<Map<String,Object>> queryBuyer(P p);

    Integer queryBuyerCount(P p);



}

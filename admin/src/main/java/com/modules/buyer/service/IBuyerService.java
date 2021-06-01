package com.modules.buyer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.modules.buyer.entity.BuyerEntity;
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
public interface IBuyerService extends IService<BuyerEntity> {


    R listPage(P p);

}

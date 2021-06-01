package com.modules.buyer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.buyer.entity.BuyerEntity;
import com.modules.buyer.mapper.BuyerMapper;
import com.modules.buyer.service.IBuyerService;
import com.yph.util.MapUtil;
import com.yph.util.P;
import com.yph.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
@Service
public class BuyerServiceImpl extends ServiceImpl<BuyerMapper, BuyerEntity> implements IBuyerService {


    @Autowired
    BuyerMapper buyerMapper;

    @Override
    public R listPage(P p) {
        List<Map<String, Object>> maps = buyerMapper.queryBuyer(p);
        for (Map<String, Object> map : maps) {
            try {
                MapUtil.mapKeySetLine2Upper(map);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return R.success("success").data(maps).set("count",buyerMapper.queryBuyerCount(p));
    }
}

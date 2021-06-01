package com.modules.task.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.task.entity.TaskEntity;
import com.modules.task.mapper.TaskMapper;
import com.modules.task.service.ITaskService;
import com.yph.entity.RateEntity;
import com.yph.enun.TypeEnum;
import com.yph.util.MapUtil;
import com.yph.util.P;
import com.yph.util.R;
import com.yph.util.ShopRateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
public class TaskServiceImpl extends ServiceImpl<TaskMapper, TaskEntity> implements ITaskService {

    @Autowired
    TaskMapper taskMapper;

    @Autowired
    ShopRateUtil shopRateUtil;


    @Override
    public R listTask(P p) {
        List<Map<String,Object>> taskEntities = taskMapper.queryTask(p);
        for (Map<String, Object> taskEntity : taskEntities) {
            try {
                MapUtil.mapKeySetLine2Upper(taskEntity);
                String shopColumn = taskEntity.get("shopColumn")==null? null:taskEntity.get("shopColumn").toString();
                String shopId = taskEntity.get("shopId")==null? null:taskEntity.get("shopId").toString();
                String price = taskEntity.get("price")==null? null:taskEntity.get("price").toString();
                String taskCount = taskEntity.get("taskCount")==null? null:taskEntity.get("taskCount").toString();
                String category = taskEntity.get("category")==null? null:taskEntity.get("category").toString();
                if (shopColumn==null || shopId==null || price==null || taskCount ==null||category==null){
                    continue;
                }
                String column = TypeEnum.getColumn(Integer.parseInt(category));
                String commission = taskEntity.get(column)==null? null:taskEntity.get(column).toString();
                if (commission == null) {
                    continue;
                }
                BigDecimal bigPrice = new BigDecimal(price);
                RateEntity rateByShop = shopRateUtil.getRateByShop(Integer.valueOf(shopId), shopColumn);
                BigDecimal rate = rateByShop.getRate();
                BigDecimal sumPrincipal = bigPrice.multiply(rate);
                BigDecimal commissionBig = new BigDecimal(commission);
                BigDecimal sumCommission = commissionBig.multiply(new BigDecimal(taskCount));
                taskEntity.put("sumCommission",sumCommission);
                taskEntity.put("sumPrincipal",sumPrincipal);
                taskEntity.put("total",sumCommission.add(sumPrincipal));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return R.success().data(taskEntities).set("count",taskMapper.queryTaskCount(p));
    }


}

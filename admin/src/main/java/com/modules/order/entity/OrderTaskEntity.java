package com.modules.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
@TableName("order_task")
public class OrderTaskEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_task_id", type = IdType.AUTO)
    private Integer orderTaskId;

    private String code;

    /**
     * 商户任务ID
     */
    private Integer taskId;

    /**
     * 买手任务ID
     */
    private Integer buyerTaskId;

    public Integer getOrderTaskId() {
        return orderTaskId;
    }

    public OrderTaskEntity setOrderTaskId(Integer orderTaskId) {
        this.orderTaskId = orderTaskId;
        return this;
    }
    public String getCode() {
        return code;
    }

    public OrderTaskEntity setCode(String code) {
        this.code = code;
        return this;
    }
    public Integer getTaskId() {
        return taskId;
    }

    public OrderTaskEntity setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getBuyerTaskId() {
        return buyerTaskId;
    }

    public OrderTaskEntity setBuyerTaskId(Integer buyerTaskId) {
        this.buyerTaskId = buyerTaskId;
        return this;
    }

    @Override
    public String toString() {
        return "OrderTaskEntity{" +
            "orderTaskId=" + orderTaskId +
            ", code=" + code +
            ", taskId=" + taskId +
            ", buyerTaskId=" + buyerTaskId +
        "}";
    }
}

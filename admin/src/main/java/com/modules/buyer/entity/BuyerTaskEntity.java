package com.modules.buyer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
@TableName("buyer_task")
public class BuyerTaskEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    @TableId(value = "buyer_task_id", type = IdType.AUTO)
    private Integer buyerTaskId;

    /**
     * 执行编号
     */
    private String code;

    /**
     * asin
     */
    private String asin;

    /**
     * 类型
     */
    private Integer typeId;

    /**
     * 订单号
     */
    private String orderCode;

    /**
     * 订单金额
     */
    private BigDecimal orderMoney;

    /**
     * 订单日期
     */
    private Date orderTime;

    /**
     * 订单审核结果
     */
    private String orderAudit;

    /**
     * 评论日期
     */
    private Date commentTime;

    /**
     * 评论截图
     */
    private String commentImg;

    /**
     * 评论审核结果
     */
    private String commentAudit;

    public Integer getBuyerTaskId() {
        return buyerTaskId;
    }

    public BuyerTaskEntity setBuyerTaskId(Integer buyerTaskId) {
        this.buyerTaskId = buyerTaskId;
        return this;
    }
    public String getCode() {
        return code;
    }

    public BuyerTaskEntity setCode(String code) {
        this.code = code;
        return this;
    }
    public String getAsin() {
        return asin;
    }

    public BuyerTaskEntity setAsin(String asin) {
        this.asin = asin;
        return this;
    }
    public Integer getTypeId() {
        return typeId;
    }

    public BuyerTaskEntity setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }
    public String getOrderCode() {
        return orderCode;
    }

    public BuyerTaskEntity setOrderCode(String orderCode) {
        this.orderCode = orderCode;
        return this;
    }
    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public BuyerTaskEntity setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
        return this;
    }
    public Date getOrderTime() {
        return orderTime;
    }

    public BuyerTaskEntity setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderAudit() {
        return orderAudit;
    }

    public BuyerTaskEntity setOrderAudit(String orderAudit) {
        this.orderAudit = orderAudit;
        return this;
    }
    public Date getCommentTime() {
        return commentTime;
    }

    public BuyerTaskEntity setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
        return this;
    }
    public String getCommentImg() {
        return commentImg;
    }

    public BuyerTaskEntity setCommentImg(String commentImg) {
        this.commentImg = commentImg;
        return this;
    }
    public String getCommentAudit() {
        return commentAudit;
    }

    public BuyerTaskEntity setCommentAudit(String commentAudit) {
        this.commentAudit = commentAudit;
        return this;
    }

    @Override
    public String toString() {
        return "BuyerTaskEntity{" +
            "buyerTaskId=" + buyerTaskId +
            ", code=" + code +
            ", asin=" + asin +
            ", typeId=" + typeId +
            ", orderCode=" + orderCode +
            ", orderMoney=" + orderMoney +
            ", orderTime=" + orderTime +
            ", orderAudit=" + orderAudit +
            ", commentTime=" + commentTime +
            ", commentImg=" + commentImg +
            ", commentAudit=" + commentAudit +
        "}";
    }
}

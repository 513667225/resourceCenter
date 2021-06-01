package com.modules.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2021-05-31
 */
@TableName("task")
public class TaskEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "task_id", type = IdType.AUTO)
    private Integer taskId;

    /**
     * 用户ID
     */
    private Integer shopId;

    /**
     * 国家
     */
    private Integer countryId;

    /**
     * ASIN
     */
    private String asin;

    /**
     * 图片地址
     */
    private String img;

    /**
     * 类目
     */
    private Integer typeId;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 店铺
     */
    private String shop;

    /**
     * 类型1:文字2:图片3:视频
     */
    private Integer category;

    /**
     * 个数
     */
    private Integer taskCount;

    public Integer getTaskId() {
        return taskId;
    }

    public TaskEntity setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public TaskEntity setCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getAsin() {
        return asin;
    }

    public TaskEntity setAsin(String asin) {
        this.asin = asin;
        return this;
    }
    public String getImg() {
        return img;
    }

    public TaskEntity setImg(String img) {
        this.img = img;
        return this;
    }
    public Integer getTypeId() {
        return typeId;
    }

    public TaskEntity setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }
    public String getKeyword() {
        return keyword;
    }

    public TaskEntity setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public TaskEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    public String getShop() {
        return shop;
    }

    public TaskEntity setShop(String shop) {
        this.shop = shop;
        return this;
    }
    public Integer getCategory() {
        return category;
    }

    public TaskEntity setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getTaskCount() {
        return taskCount;
    }

    public TaskEntity setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "TaskEntity{" +
            "taskId=" + taskId +
            ", countryId=" + countryId +
            ", asin=" + asin +
            ", img=" + img +
            ", typeId=" + typeId +
            ", keyword=" + keyword +
            ", price=" + price +
            ", shop=" + shop +
            ", category=" + category +
            ", taskCount=" + taskCount +
        "}";
    }
}

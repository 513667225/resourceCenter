package com.modules.buyer.entity;

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
@TableName("buyer")
public class BuyerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "buyer_id", type = IdType.AUTO)
    private Integer buyerId;

    /**
     * 国家
     */
    private Integer countryId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 图片佣金
     */
    private BigDecimal imgCommission;

    /**
     * 文字佣金
     */
    private BigDecimal wordCommission;

    /**
     * 视频佣金
     */
    private BigDecimal videoCommission;

    /**
     * 联系方式
     */
    private String contactDetails;

    public Integer getBuyerId() {
        return buyerId;
    }

    public BuyerEntity setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public Integer getCountryId() {
        return countryId;
    }

    public BuyerEntity setCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getName() {
        return name;
    }

    public BuyerEntity setName(String name) {
        this.name = name;
        return this;
    }
    public Integer getLevel() {
        return level;
    }

    public BuyerEntity setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public BigDecimal getImgCommission() {
        return imgCommission;
    }

    public BuyerEntity setImgCommission(BigDecimal imgCommission) {
        this.imgCommission = imgCommission;
        return this;
    }
    public BigDecimal getWordCommission() {
        return wordCommission;
    }

    public BuyerEntity setWordCommission(BigDecimal wordCommission) {
        this.wordCommission = wordCommission;
        return this;
    }
    public BigDecimal getVideoCommission() {
        return videoCommission;
    }

    public BuyerEntity setVideoCommission(BigDecimal videoCommission) {
        this.videoCommission = videoCommission;
        return this;
    }
    public String getContactDetails() {
        return contactDetails;
    }

    public BuyerEntity setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    @Override
    public String toString() {
        return "BuyerEntity{" +
            "buyerId=" + buyerId +
            ", countryId=" + countryId +
            ", name=" + name +
            ", level=" + level +
            ", imgCommission=" + imgCommission +
            ", wordCommission=" + wordCommission +
            ", videoCommission=" + videoCommission +
            ", contactDetails=" + contactDetails +
        "}";
    }
}

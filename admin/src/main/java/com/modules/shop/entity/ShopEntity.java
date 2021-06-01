package com.modules.shop.entity;

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
@TableName("shop")
public class ShopEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商户id
     */
    @TableId(value = "shop_id", type = IdType.AUTO)
    private Integer shopId;

    /**
     * 商户名称
     */
    private String shopName;

    /**
     * 联系人
     */
    private String contacts;


    /**
     * 文字佣金
     */
    private BigDecimal wordCommission;

    /**
     * 图片佣金
     */
    private BigDecimal imgCommission;

    /**
     * 视频佣金
     */
    private BigDecimal videoCommission;

    public Integer getShopId() {
        return shopId;
    }

    public ShopEntity setShopId(Integer shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopName() {
        return shopName;
    }

    public ShopEntity setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getContacts() {
        return contacts;
    }

    public ShopEntity setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }

    public BigDecimal getWordCommission() {
        return wordCommission;
    }

    public ShopEntity setWordCommission(BigDecimal wordCommission) {
        this.wordCommission = wordCommission;
        return this;
    }
    public BigDecimal getImgCommission() {
        return imgCommission;
    }

    public ShopEntity setImgCommission(BigDecimal imgCommission) {
        this.imgCommission = imgCommission;
        return this;
    }
    public BigDecimal getVideoCommission() {
        return videoCommission;
    }

    public ShopEntity setVideoCommission(BigDecimal videoCommission) {
        this.videoCommission = videoCommission;
        return this;
    }

    @Override
    public String toString() {
        return "ShopEntity{" +
            "shopId=" + shopId +
            ", shopName=" + shopName +
            ", contacts=" + contacts +
            ", wordCommission=" + wordCommission +
            ", imgCommission=" + imgCommission +
            ", videoCommission=" + videoCommission +
        "}";
    }
}

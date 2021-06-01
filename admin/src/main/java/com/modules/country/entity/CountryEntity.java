package com.modules.country.entity;

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
@TableName("country")
public class CountryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "country_id", type = IdType.AUTO)
    private Integer countryId;

    private String countryName;

    /**
     * 排序符号
     */
    private Integer sortValie;

    public Integer getCountryId() {
        return countryId;
    }

    public CountryEntity setCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryName() {
        return countryName;
    }

    public CountryEntity setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    public Integer getSortValie() {
        return sortValie;
    }

    public CountryEntity setSortValie(Integer sortValie) {
        this.sortValie = sortValie;
        return this;
    }

    @Override
    public String toString() {
        return "CountryEntity{" +
            "countryId=" + countryId +
            ", countryName=" + countryName +
            ", sortValie=" + sortValie +
        "}";
    }
}

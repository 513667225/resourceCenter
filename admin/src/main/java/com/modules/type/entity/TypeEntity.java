package com.modules.type.entity;

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
@TableName("type")
public class TypeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "type_id", type = IdType.AUTO)
    private Integer typeId;

    private String typeName;

    /**
     * 排序字段
     */
    private Integer sortValue;

    public Integer getTypeId() {
        return typeId;
    }

    public TypeEntity setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }
    public String getTypeName() {
        return typeName;
    }

    public TypeEntity setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public Integer getSortValue() {
        return sortValue;
    }

    public TypeEntity setSortValue(Integer sortValue) {
        this.sortValue = sortValue;
        return this;
    }

    @Override
    public String toString() {
        return "TypeEntity{" +
            "typeId=" + typeId +
            ", typeName=" + typeName +
            ", sortValue=" + sortValue +
        "}";
    }
}

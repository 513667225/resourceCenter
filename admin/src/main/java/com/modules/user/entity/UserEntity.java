package com.modules.user.entity;

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
 * @since 2021-06-01
 */
@TableName("user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String username;

    private String password;

    /**
     * 0:管理员1:商户2:买手
     */
    private Integer type;

    /**
     * 级别
     */
    private Integer level;

    public Integer getUserId() {
        return userId;
    }

    public UserEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }
    public Integer getType() {
        return type;
    }

    public UserEntity setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getLevel() {
        return level;
    }

    public UserEntity setLevel(Integer level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
            "userId=" + userId +
            ", username=" + username +
            ", password=" + password +
            ", type=" + type +
            ", level=" + level +
        "}";
    }
}

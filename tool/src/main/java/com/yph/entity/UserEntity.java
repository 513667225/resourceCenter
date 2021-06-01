package com.yph.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author 
 * @since 2020-11-12
 */
@TableName("user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 最近一次登录时间
     */
    private Date userLastLoginTime;

    /**
     * V0 -  V6
     */
    private Integer userLevel;

    /**
     * 用户角色(0 普通用户;1 VIP;2 经理;3 总裁)
     */
    private Integer role;

    /**
     * 用户昵称
     */
    private String userNickname;

    /**
     * 用户手机号码
     */
    private String userMobile;

    /**
     * 用户头像图片
     */
    private String userAvatar;

    /**
     * 0 可用;1 禁用;2 注销
     */
    private Integer userStatus;

    /**
     * 用户推荐人ID
     */
    private Integer userReferrer;

    /**
     * 创建时间
     */
    private Date addTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 邀请团队人数
     */
    private Integer goupSize;

    /**
     * 直邀人数
     */
    private Integer underlingSize;

    /**
     * 团队VIP人数
     */
    private Integer groupVipSize;

    /**
     * 直邀VIP人数
     */
    private Integer underlingVipSize;

    /**
     * 团队经理人数
     */
    private Integer groupManagerSize;

    /**
     * 直邀经理人数
     */
    private Integer underlingManagerSize;

    /**
     * 团队总裁人数
     */
    private Integer groupCeoSize;

    /**
     * 直邀总裁人数
     */
    private Integer underlingCeoSize;



    /**
     * 顶层推荐人id
     */
    private Integer topRefereeId;

    /**
     * 生命源
     */
    private Long lifeSource;

    /**
     * 不可提现消费能量源
     */
    private Long energySource;

    /**
     * 可提现能量源
     */
    private  Long activateEnergySource;

    /**
     * 当日需结算能量源
     */
    private  Long clearingEnergySource;
    /**
     * 币
     */
    private Long bean;

    /**
     * 可提现币
     */
    private  Long tranBean;

    /**
     * 关系
     */
    private String relation;


    /**
     * 银行卡
     */
    private String bankCard;

    /**
     * 冻结生命源
     */
    private Long freezeLifeSource;
    /**
     * 冻结能量源
     */
    private Long freezeEnergySource;
    /**
     * 冻结币
     */
    private Long freezeBean;

    /**
     * 个人总业绩
     */
    private Long sumEnergySource;


    /**
     *团队总业绩
     */
    private Long sumTeamEnergySource;


    /**
     * 是否是省市区代理
     */
    private Integer isAdmin;

    /**
     * 省市区 级别
     */
    @TableField("`rank`")
    private Integer rank;


    /**
     * 城市三级联动表ID
     */
    private Integer zoneCode;

    /**
     * 城市三级联动表名称
     */
    private String zoneName;

    /**
     * 是否为冻结奖励 0：未冻结  1：已冻结
     */
    private Integer isFreezeAward;


    /**
     * 是否冻结提现 0未冻结  1已冻结
     */
    private Integer isFreezeWithdrawDeposit;

    /**
     * 是否冻结释放 0未冻结 1已冻结
     */
    private Integer isFreezeRelease;

    /**
     * 是否锁定用户 0未锁定 1已锁定
     */
    private Integer isLockTheUser;

    private String address;

    private Integer passwordTow;

    /**
     * 生命源价值
     */
    private  Long lifeSourceAssets;


    /**
     * 中奖次数
     * @return
     */
    private int bingoCount;

    public Long getTranBean() {
        return tranBean;
    }

    public void setTranBean(Long tranBean) {
        this.tranBean = tranBean;
    }

    public Integer getPasswordTow() {
        return passwordTow;
    }

    public void setPasswordTow(Integer passwordTow) {
        this.passwordTow = passwordTow;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Integer getIsFreezeAward() {
        return isFreezeAward;
    }

    public void setIsFreezeAward(Integer isFreezeAward) {
        this.isFreezeAward = isFreezeAward;
    }

    public Integer getIsFreezeWithdrawDeposit() {
        return isFreezeWithdrawDeposit;
    }

    public void setIsFreezeWithdrawDeposit(Integer isFreezeWithdrawDeposit) {
        this.isFreezeWithdrawDeposit = isFreezeWithdrawDeposit;
    }

    public Long getActivateEnergySource() {
        return activateEnergySource;
    }

    public void setActivateEnergySource(Long activateEnergySource) {
        this.activateEnergySource = activateEnergySource;
    }

    public Long getClearingEnergySource() {
        return clearingEnergySource;
    }

    public void setClearingEnergySource(Long clearingEnergySource) {
        this.clearingEnergySource = clearingEnergySource;
    }

    public Integer getUnderlingVipSize() {
        return underlingVipSize;
    }

    public void setUnderlingVipSize(Integer underlingVipSize) {
        this.underlingVipSize = underlingVipSize;
    }

    public Integer getGroupManagerSize() {
        return groupManagerSize;
    }

    public void setGroupManagerSize(Integer groupManagerSize) {
        this.groupManagerSize = groupManagerSize;
    }

    public Integer getUnderlingManagerSize() {
        return underlingManagerSize;
    }

    public void setUnderlingManagerSize(Integer underlingManagerSize) {
        this.underlingManagerSize = underlingManagerSize;
    }

    public Integer getGroupCeoSize() {
        return groupCeoSize;
    }

    public void setGroupCeoSize(Integer groupCeoSize) {
        this.groupCeoSize = groupCeoSize;
    }

    public Integer getUnderlingCeoSize() {
        return underlingCeoSize;
    }

    public void setUnderlingCeoSize(Integer underlingCeoSize) {
        this.underlingCeoSize = underlingCeoSize;
    }

    public Integer getIsFreezeRelease() {
        return isFreezeRelease;
    }

    public void setIsFreezeRelease(Integer isFreezeRelease) {
        this.isFreezeRelease = isFreezeRelease;
    }

    public Integer getIsLockTheUser() {
        return isLockTheUser;
    }

    public void setIsLockTheUser(Integer isLockTheUser) {
        this.isLockTheUser = isLockTheUser;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(Integer zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }


    public UserEntity() {
    }

    public UserEntity(Integer userId, Integer userLevel,Integer rank) {
        this.userId = userId;
        this.userLevel = userLevel;
        this.rank = rank;
    }

    public Long getSumEnergySource() {
        return sumEnergySource;
    }

    public void setSumEnergySource(Long sumEnergySource) {
        this.sumEnergySource = sumEnergySource;
    }

    public Long getSumTeamEnergySource() {
        return sumTeamEnergySource;
    }

    public void setSumTeamEnergySource(Long sumTeamEnergySource) {
        this.sumTeamEnergySource = sumTeamEnergySource;
    }

    public Integer getUserId() {
        return userId;
    }

    public UserEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public UserEntity setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public UserEntity setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
        return this;
    }
    public Integer getUserLevel() {
        return userLevel;
    }

    public UserEntity setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public String getUserNickname() {
        return userNickname;
    }

    public UserEntity setUserNickname(String userNickname) {
        this.userNickname = userNickname;
        return this;
    }
    public String getUserMobile() {
        return userMobile;
    }

    public UserEntity setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserAvatar() {
        return userAvatar;
    }

    public UserEntity setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
        return this;
    }
    public Integer getUserStatus() {
        return userStatus;
    }

    public UserEntity setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public Integer getUserReferrer() {
        return userReferrer;
    }

    public UserEntity setUserReferrer(Integer userReferrer) {
        this.userReferrer = userReferrer;
        return this;
    }
    public Date getAddTime() {
        return addTime;
    }

    public UserEntity setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public UserEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Integer getGoupSize() {
        return goupSize;
    }

    public UserEntity setGoupSize(Integer goupSize) {
        this.goupSize = goupSize;
        return this;
    }
    public Integer getUnderlingSize() {
        return underlingSize;
    }

    public UserEntity setUnderlingSize(Integer underlingSize) {
        this.underlingSize = underlingSize;
        return this;
    }
    public Integer getGroupVipSize() {
        return groupVipSize;
    }

    public UserEntity setGroupVipSize(Integer groupVipSize) {
        this.groupVipSize = groupVipSize;
        return this;
    }
    public Integer getTopRefereeId() {
        return topRefereeId;
    }

    public UserEntity setTopRefereeId(Integer topRefereeId) {
        this.topRefereeId = topRefereeId;
        return this;
    }

    public Long getLifeSource() {
        return lifeSource;
    }

    public void setLifeSource(Long lifeSource) {
        this.lifeSource = lifeSource;
    }

    public Long getEnergySource() {
        return energySource;
    }

    public void setEnergySource(Long energySource) {
        this.energySource = energySource;
    }

    public Long getBean() {
        return bean;
    }

    public void setBean(Long bean) {
        this.bean = bean;
    }

    public String getRelation() {
        return relation;
    }

    public UserEntity setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getBankCard() {
        return bankCard;
    }

    public UserEntity setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }

    public Long getFreezeLifeSource() {
        return freezeLifeSource;
    }

    public void setFreezeLifeSource(Long freezeLifeSource) {
        this.freezeLifeSource = freezeLifeSource;
    }

    public Long getFreezeEnergySource() {
        return freezeEnergySource;
    }

    public void setFreezeEnergySource(Long freezeEnergySource) {
        this.freezeEnergySource = freezeEnergySource;
    }

    public Long getFreezeBean() {
        return freezeBean;
    }

    public void setFreezeBean(Long freezeBean) {
        this.freezeBean = freezeBean;
    }

    public Long getLifeSourceAssets() {
        return lifeSourceAssets;
    }

    public void setLifeSourceAssets(Long lifeSourceAssets) {
        this.lifeSourceAssets = lifeSourceAssets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    public int getBingoCount() {
        return bingoCount;
    }

    public void setBingoCount(int bingoCount) {
        this.bingoCount = bingoCount;
    }
}

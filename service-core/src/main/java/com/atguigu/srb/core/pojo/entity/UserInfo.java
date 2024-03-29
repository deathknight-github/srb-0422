package com.atguigu.srb.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户基本信息
 * </p>
 *
 * @author 30912
 * @since 2021-08-25
 */
@ApiModel(value="UserInfo对象", description="用户基本信息")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "1：出借人 2：借款人")
    private Integer userType;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "微信用户标识openid")
    private String openid;

    @ApiModelProperty(value = "头像")
    private String headImg;

    @ApiModelProperty(value = "绑定状态（0：未绑定，1：绑定成功 -1：绑定失败）")
    private Integer bindStatus;

    @ApiModelProperty(value = "借款人认证状态（0：未认证 1：认证中 2：认证通过 -1：认证失败）")
    private Integer borrowAuthStatus;

    @ApiModelProperty(value = "绑定账户协议号")
    private String bindCode;

    @ApiModelProperty(value = "用户积分")
    private Integer integral;

    @ApiModelProperty(value = "状态（0：锁定 1：正常）")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除(1:已删除，0:未删除)")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Integer getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }

    public Integer getBorrowAuthStatus() {
        return borrowAuthStatus;
    }

    public void setBorrowAuthStatus(Integer borrowAuthStatus) {
        this.borrowAuthStatus = borrowAuthStatus;
    }

    public String getBindCode() {
        return bindCode;
    }

    public void setBindCode(String bindCode) {
        this.bindCode = bindCode;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
        "id=" + id +
        ", userType=" + userType +
        ", mobile=" + mobile +
        ", password=" + password +
        ", nickName=" + nickName +
        ", name=" + name +
        ", idCard=" + idCard +
        ", email=" + email +
        ", openid=" + openid +
        ", headImg=" + headImg +
        ", bindStatus=" + bindStatus +
        ", borrowAuthStatus=" + borrowAuthStatus +
        ", bindCode=" + bindCode +
        ", integral=" + integral +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", deleted=" + deleted +
        "}";
    }
}

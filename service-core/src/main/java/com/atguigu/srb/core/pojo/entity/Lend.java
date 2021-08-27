package com.atguigu.srb.core.pojo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 标的准备表
 * </p>
 *
 * @author 30912
 * @since 2021-08-25
 */
@ApiModel(value="Lend对象", description="标的准备表")
public class Lend implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "借款用户id")
    private Long userId;

    @ApiModelProperty(value = "借款信息id")
    private Long borrowInfoId;

    @ApiModelProperty(value = "标的编号")
    private String lendNo;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "标的金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "投资期数")
    private Integer period;

    @ApiModelProperty(value = "年化利率")
    private BigDecimal lendYearRate;

    @ApiModelProperty(value = "平台服务费率")
    private BigDecimal serviceRate;

    @ApiModelProperty(value = "还款方式")
    private Integer returnMethod;

    @ApiModelProperty(value = "最低投资金额")
    private BigDecimal lowestAmount;

    @ApiModelProperty(value = "已投金额")
    private BigDecimal investAmount;

    @ApiModelProperty(value = "投资人数")
    private Integer investNum;

    @ApiModelProperty(value = "发布日期")
    private LocalDateTime publishDate;

    @ApiModelProperty(value = "开始日期")
    private LocalDate lendStartDate;

    @ApiModelProperty(value = "结束日期")
    private LocalDate lendEndDate;

    @ApiModelProperty(value = "说明")
    private String lendInfo;

    @ApiModelProperty(value = "平台预期收益")
    private BigDecimal expectAmount;

    @ApiModelProperty(value = "实际收益")
    private BigDecimal realAmount;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime checkTime;

    @ApiModelProperty(value = "审核用户id")
    private Long checkAdminId;

    @ApiModelProperty(value = "放款时间")
    private LocalDateTime paymentTime;

    @ApiModelProperty(value = "放款人id")
    private LocalDateTime paymentAdminId;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBorrowInfoId() {
        return borrowInfoId;
    }

    public void setBorrowInfoId(Long borrowInfoId) {
        this.borrowInfoId = borrowInfoId;
    }

    public String getLendNo() {
        return lendNo;
    }

    public void setLendNo(String lendNo) {
        this.lendNo = lendNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public BigDecimal getLendYearRate() {
        return lendYearRate;
    }

    public void setLendYearRate(BigDecimal lendYearRate) {
        this.lendYearRate = lendYearRate;
    }

    public BigDecimal getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(BigDecimal serviceRate) {
        this.serviceRate = serviceRate;
    }

    public Integer getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(Integer returnMethod) {
        this.returnMethod = returnMethod;
    }

    public BigDecimal getLowestAmount() {
        return lowestAmount;
    }

    public void setLowestAmount(BigDecimal lowestAmount) {
        this.lowestAmount = lowestAmount;
    }

    public BigDecimal getInvestAmount() {
        return investAmount;
    }

    public void setInvestAmount(BigDecimal investAmount) {
        this.investAmount = investAmount;
    }

    public Integer getInvestNum() {
        return investNum;
    }

    public void setInvestNum(Integer investNum) {
        this.investNum = investNum;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getLendStartDate() {
        return lendStartDate;
    }

    public void setLendStartDate(LocalDate lendStartDate) {
        this.lendStartDate = lendStartDate;
    }

    public LocalDate getLendEndDate() {
        return lendEndDate;
    }

    public void setLendEndDate(LocalDate lendEndDate) {
        this.lendEndDate = lendEndDate;
    }

    public String getLendInfo() {
        return lendInfo;
    }

    public void setLendInfo(String lendInfo) {
        this.lendInfo = lendInfo;
    }

    public BigDecimal getExpectAmount() {
        return expectAmount;
    }

    public void setExpectAmount(BigDecimal expectAmount) {
        this.expectAmount = expectAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public Long getCheckAdminId() {
        return checkAdminId;
    }

    public void setCheckAdminId(Long checkAdminId) {
        this.checkAdminId = checkAdminId;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public LocalDateTime getPaymentAdminId() {
        return paymentAdminId;
    }

    public void setPaymentAdminId(LocalDateTime paymentAdminId) {
        this.paymentAdminId = paymentAdminId;
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
        return "Lend{" +
        "id=" + id +
        ", userId=" + userId +
        ", borrowInfoId=" + borrowInfoId +
        ", lendNo=" + lendNo +
        ", title=" + title +
        ", amount=" + amount +
        ", period=" + period +
        ", lendYearRate=" + lendYearRate +
        ", serviceRate=" + serviceRate +
        ", returnMethod=" + returnMethod +
        ", lowestAmount=" + lowestAmount +
        ", investAmount=" + investAmount +
        ", investNum=" + investNum +
        ", publishDate=" + publishDate +
        ", lendStartDate=" + lendStartDate +
        ", lendEndDate=" + lendEndDate +
        ", lendInfo=" + lendInfo +
        ", expectAmount=" + expectAmount +
        ", realAmount=" + realAmount +
        ", status=" + status +
        ", checkTime=" + checkTime +
        ", checkAdminId=" + checkAdminId +
        ", paymentTime=" + paymentTime +
        ", paymentAdminId=" + paymentAdminId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", deleted=" + deleted +
        "}";
    }
}

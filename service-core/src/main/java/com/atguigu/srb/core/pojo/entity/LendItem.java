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
 * 标的出借记录表
 * </p>
 *
 * @author 30912
 * @since 2021-08-25
 */
@ApiModel(value="LendItem对象", description="标的出借记录表")
public class LendItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "投资编号")
    private String lendItemNo;

    @ApiModelProperty(value = "标的id")
    private Long lendId;

    @ApiModelProperty(value = "投资用户id")
    private Long investUserId;

    @ApiModelProperty(value = "投资人名称")
    private String investName;

    @ApiModelProperty(value = "投资金额")
    private BigDecimal investAmount;

    @ApiModelProperty(value = "年化利率")
    private BigDecimal lendYearRate;

    @ApiModelProperty(value = "投资时间")
    private LocalDateTime investTime;

    @ApiModelProperty(value = "开始日期")
    private LocalDate lendStartDate;

    @ApiModelProperty(value = "结束日期")
    private LocalDate lendEndDate;

    @ApiModelProperty(value = "预期收益")
    private BigDecimal expectAmount;

    @ApiModelProperty(value = "实际收益")
    private BigDecimal realAmount;

    @ApiModelProperty(value = "状态（0：默认 1：已支付 2：已还款）")
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

    public String getLendItemNo() {
        return lendItemNo;
    }

    public void setLendItemNo(String lendItemNo) {
        this.lendItemNo = lendItemNo;
    }

    public Long getLendId() {
        return lendId;
    }

    public void setLendId(Long lendId) {
        this.lendId = lendId;
    }

    public Long getInvestUserId() {
        return investUserId;
    }

    public void setInvestUserId(Long investUserId) {
        this.investUserId = investUserId;
    }

    public String getInvestName() {
        return investName;
    }

    public void setInvestName(String investName) {
        this.investName = investName;
    }

    public BigDecimal getInvestAmount() {
        return investAmount;
    }

    public void setInvestAmount(BigDecimal investAmount) {
        this.investAmount = investAmount;
    }

    public BigDecimal getLendYearRate() {
        return lendYearRate;
    }

    public void setLendYearRate(BigDecimal lendYearRate) {
        this.lendYearRate = lendYearRate;
    }

    public LocalDateTime getInvestTime() {
        return investTime;
    }

    public void setInvestTime(LocalDateTime investTime) {
        this.investTime = investTime;
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
        return "LendItem{" +
        "id=" + id +
        ", lendItemNo=" + lendItemNo +
        ", lendId=" + lendId +
        ", investUserId=" + investUserId +
        ", investName=" + investName +
        ", investAmount=" + investAmount +
        ", lendYearRate=" + lendYearRate +
        ", investTime=" + investTime +
        ", lendStartDate=" + lendStartDate +
        ", lendEndDate=" + lendEndDate +
        ", expectAmount=" + expectAmount +
        ", realAmount=" + realAmount +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", deleted=" + deleted +
        "}";
    }
}

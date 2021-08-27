package com.atguigu.srb.core.pojo.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 积分等级表
 * </p>
 *
 * @author 30912
 * @since 2021-08-25
 */
@ApiModel(value="IntegralGrade对象", description="积分等级表")
public class IntegralGrade implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "积分区间开始")
    private Integer integralStart;

    @ApiModelProperty(value = "积分区间结束")
    private Integer integralEnd;

    @ApiModelProperty(value = "借款额度")
    private BigDecimal borrowAmount;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
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

    public Integer getIntegralStart() {
        return integralStart;
    }

    public void setIntegralStart(Integer integralStart) {
        this.integralStart = integralStart;
    }

    public Integer getIntegralEnd() {
        return integralEnd;
    }

    public void setIntegralEnd(Integer integralEnd) {
        this.integralEnd = integralEnd;
    }

    public BigDecimal getBorrowAmount() {
        return borrowAmount;
    }

    public void setBorrowAmount(BigDecimal borrowAmount) {
        this.borrowAmount = borrowAmount;
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
        return "IntegralGrade{" +
        "id=" + id +
        ", integralStart=" + integralStart +
        ", integralEnd=" + integralEnd +
        ", borrowAmount=" + borrowAmount +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", deleted=" + deleted +
        "}";
    }
}

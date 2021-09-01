package com.atguigu.srb.core.controller.admin;


import com.atguigu.common.exception.Assert;
import com.atguigu.common.exception.BusinessException;
import com.atguigu.common.result.R;
import com.atguigu.common.result.ResponseEnum;
import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import com.atguigu.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author 30912
 * @since 2021-08-25
 */
@Api("积分等级列表")
@Slf4j
@RestController
@RequestMapping("/admin/core/integralGrade")
@CrossOrigin
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    /**
     * 查询用get
     *
     * @return IntegralGrade结果集
     */
    @ApiOperation("积分等级---查询所有数据")
    @GetMapping("/list")
    public R getIntegralGradeList() {
        List<IntegralGrade> integralGradeList = integralGradeService.list();
        if (integralGradeList != null && integralGradeList.size() != 0) {
            return R.ok().data("integralGradeList", integralGradeList).message("查询数据成功");
        } else {
            throw new BusinessException(ResponseEnum.GET_DATA_NULL_ERROE);
            //return R.error().message("查询数据失败");
        }
    }

    /**
     * 根据Id查询单条数据
     */
    @ApiOperation("根据Id查询单条数据")
    @GetMapping("get/{id}")
    public R getIntegralGradeById(@PathVariable("id") Long id) {
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade != null) {
            return R.ok().data("integralGrade", integralGrade).message("查询数据成功");
        } else {
            throw new BusinessException(ResponseEnum.GET_DATA_NULL_ERROE);
            //return R.error().message("查询数据失败");
        }
    }

    /**
     * 增加用post
     */
    @ApiOperation("积分等级---添加单条数据")
    @PostMapping("save")
    public R postIntegralGrade(
            @ApiParam("积分等级---保存添加数据")
            @RequestBody IntegralGrade integralGrade
    ) {
        try {

            Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.SAVE_DATA_NULL_ERROE);
            integralGradeService.save(integralGrade);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseEnum.SAVE_DATA_NULL_ERROE);
            //return R.error().message("保存数据失败"+"原因："+e.getMessage());
        }
    }

    /**
     * 删除用delete
     */
    @ApiOperation("积分等级---根据Id删除一条数据")
    @DeleteMapping("/remove/{id}")
    public R deleteIntegralGradeById(@PathVariable("id") Long id) {
        try {
            Assert.notNull(id, ResponseEnum.DELETE_DATA_NULL_ERROE);
            integralGradeService.removeById(id);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseEnum.DELETE_DATA_NULL_ERROE);
            //return R.error().message("删除数据失败"+"原因："+e.getMessage());
        }
    }

    /**
     * 修改用put/post
     */
    @ApiOperation("积分等级---根据Id修改单条数据")
    @PutMapping("/update")
    public R putUpdateIntegralGradeById(
            @ApiParam("根据Id修改数据")
            @RequestBody IntegralGrade integralGrade
    ) {
        try {
            Assert.notNull(integralGrade, ResponseEnum.UPDATE_DATA_NULL_ERROE);
            integralGradeService.updateById(integralGrade);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseEnum.UPDATE_DATA_NULL_ERROE);
            //return R.error().message("修改数据失败"+"原因："+e.getMessage());
        }

    }
}


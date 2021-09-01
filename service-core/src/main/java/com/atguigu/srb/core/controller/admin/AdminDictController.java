package com.atguigu.srb.core.controller.admin;


import com.alibaba.excel.EasyExcel;
import com.atguigu.common.exception.BusinessException;
import com.atguigu.common.result.R;
import com.atguigu.common.result.ResponseEnum;
import com.atguigu.srb.core.pojo.entity.Dict;
import com.atguigu.srb.core.pojo.entity.dto.ExcelDictDTO;
import com.atguigu.srb.core.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author 30912
 * @since 2021-08-25
 */
@Api("数据字典")
@RestController
@CrossOrigin
@RequestMapping("/admin/core/dict")
public class AdminDictController {
    @Resource
    private DictService dictService;

    /**
     * Excel批量数据导入
     * @param file 导入的文件
     * @return
     */
    @ApiOperation("Excel批量导入数据字典")
    @GetMapping("/import")
    public R batchImport(
            @ApiParam(value = "Excel文件",required = true)
            @RequestParam("file")MultipartFile file
            ){
        try {
            InputStream inputStream = file.getInputStream();
            dictService.importData(inputStream);
            return R.ok().message("文件上传成功！");
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseEnum.UPLOAD_ERROR);
        }
    }


    /**
     * easyExcel数据导出
     * @param response 设置导出的excel格式（xls，xlsx）
     */
    @ApiOperation("数据导出")
    @GetMapping("/export")
    public void export(HttpServletResponse response){
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("mydict","UTF-8").replaceAll("\\+","%20");
            response.setHeader("Content-disposition","attachment;filename*=utf-8''"+ fileName +".xlsx");
            EasyExcel.write(response.getOutputStream(), ExcelDictDTO.class).sheet("数据字典").doWrite(dictService.listDictData());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseEnum.EXPORT_DATA_ERROR);
        }
    }

    @ApiOperation("查询字典列表")
    @GetMapping("/listByParentId/{parentId}")
    public R listByParentId(
            @ApiParam(value = "父节点的Id")
            @PathVariable("parentId")Long parentId){
        List<Dict> dictList=dictService.listByParentId(parentId);
        return R.ok().data("list",dictList);
    }
}


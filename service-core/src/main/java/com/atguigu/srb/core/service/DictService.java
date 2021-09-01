package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.Dict;
import com.atguigu.srb.core.pojo.entity.dto.ExcelDictDTO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author 30912
 * @since 2021-08-25
 */
public interface DictService extends IService<Dict> {
    //导入数据
    void importData(InputStream inputStream);
    //导出数据
    List<ExcelDictDTO> listDictData();
    //字典列表，查询所有
    List<Dict> listByParentId(Long parentId);
}

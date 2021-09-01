package com.atguigu.srb.core.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.atguigu.srb.core.mapper.DictMapper;
import com.atguigu.srb.core.pojo.entity.dto.ExcelDictDTO;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@Slf4j
@NoArgsConstructor
public class ExcelDictDTOListener extends AnalysisEventListener<ExcelDictDTO> {

    private static final int BATCH_COUNT=5;
    List<ExcelDictDTO> excelDictDTOList = new ArrayList<>();
    private DictMapper dictMapper;

    /**
     * 引入Mapper对象 dictMapper
     * @param dictMapper dao层字典数据对象
     */
    public ExcelDictDTOListener(DictMapper dictMapper){
        this.dictMapper=dictMapper;
    }

    @Override
    public void invoke(ExcelDictDTO data, AnalysisContext context) {
        log.info("解析到一条记录: {}", data);
        excelDictDTOList.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (excelDictDTOList.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            excelDictDTOList.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        log.info("所有数据解析完成！");
    }

    private void saveData() {
        log.info("{}条数据，开始存储数据库！", excelDictDTOList.size());
        //批量插入
        dictMapper.insertBatch(excelDictDTOList);
        log.info("存储数据库成功！");
    }
}

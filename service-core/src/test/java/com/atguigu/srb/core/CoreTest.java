package com.atguigu.srb.core;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

/**
 * @author 30912
 * @date
 * @apiNote
 */
public class CoreTest {
    @Test
    public void genCode() {
        //创建代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        //配置全局路径
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath+"/src/main/java");//主输出路径
        globalConfig.setAuthor("30912");//作者
        globalConfig.setOpen(false);//生成后是否打开资源管理器
        globalConfig.setServiceName("%sService");//去掉生成的Service就扣的首字符的I，默认生成的Service接口前面有一个I
        globalConfig.setIdType(IdType.AUTO);//设置主键策略
        globalConfig.setSwagger2(true);//开启Swagger2模式
        autoGenerator.setGlobalConfig(globalConfig);


        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/srb_core?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("Root");
        dataSourceConfig.setDbType(DbType.MYSQL);
        autoGenerator.setDataSource(dataSourceConfig);


        //代码路径配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.atguigu.srb.core");//设置生成代码的路径
        packageConfig.setEntity("pojo.entity");//此对象与数据库表的结构一一对应，通过dao层向上传输数据源对象
        autoGenerator.setPackageInfo(packageConfig);


        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体类的命名策略 驼峰命名
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);//设置数据库表字段映射到实体类的命名策略
        strategyConfig.setLogicDeleteFieldName("is_deleted");//逻辑删除的字段名
        strategyConfig.setEntityBooleanColumnRemoveIsPrefix(true);//去掉布尔字段的is_前缀
        strategyConfig.setRestControllerStyle(true);//Restful api风格控制器
        autoGenerator.setStrategy(strategyConfig);

        //启动服务
        autoGenerator.execute();
    }
}

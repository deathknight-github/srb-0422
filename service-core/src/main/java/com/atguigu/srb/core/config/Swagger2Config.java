package com.atguigu.srb.core.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket testApiConfig(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                //Swagger2组的名字
                .groupName("testApi")
                //描述信息
                .apiInfo(new ApiInfoBuilder()
                        .title("尚融宝swagger2测试-api文档")
                        .description("本文表述了swagger2的使用方法")
                        .version("1.0")
                        .contact(new Contact("30912","http://atguigu.com","3091257191@qq.com"))
                        .build()
                )
                //查询
                .select()
                //默认扫描的是根路径controller，因为controller是api接口的入口
                .paths(Predicates.and(PathSelectors.regex("/.*")))
                .build();
        return docket;
    }
    @Bean
    public Docket adminApiConfig(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                //Swagger2组的名字
                .groupName("adminApi")
                //描述信息
                .apiInfo(new ApiInfoBuilder()
                        .title("尚融宝的后台管理-api文档")
                        .description("本文表述了尚融宝项目的后台管理")
                        .version("1.0")
                        .contact(new Contact("30912","http://atguigu.com","3091257191@qq.com"))
                        .build()
                )
                //查询
                .select()
                //默认扫描的是根路径controller，因为controller是api接口的入口
                .paths(Predicates.and(PathSelectors.regex("/.*")))
                .build();
        return docket;
    }

}
package com.jxnudekt.server.config;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: LiaoXiang
 * @Description: Swagger接口文档配置 http://localhost/swagger-ui.html#/
 * @CreateDate: 2019-01-25 10:23
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket creatRestApi() {
//        ParameterBuilder builder = new ParameterBuilder();
//        builder.parameterType("header").name("login-token")
//                .description("restful方式的header参数")
//                .required(false)
//                .modelRef(new ModelRef("string")); // 在swagger里显示header

        return new Docket(DocumentationType.SWAGGER_2).groupName("第二课堂小程序接口文档")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jxnudekt.server.controller"))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Mini program APIs for the second class system of JXNU")
                .description("江西师范大学第二课堂系统小程序接口文档")
//                .termsOfServiceUrl("https://github.com/*****")
                .contact(new Contact("LiaoXiang", "https://github.com/lxlove1101", "lxlove1101@163.com"))
                .version("1.0")
                .build();
    }

}

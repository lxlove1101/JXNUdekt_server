package com.jxnudekt.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: LiaoXiang
 * @Description: Swagger接口文档配置
 * @CreateDate: 2019-01-25 10:23
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket creatRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jxnudekt.server.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Mini program APIs for the second class system of JXNU")
                .description("江西师范大学第二课堂系统小程序接口文档")
                .termsOfServiceUrl("https://github.com/*****")
                .contact(new Contact("LiaoXiang", "https://github.com/lxlove1101", "lxlove1101@163.com"))
                .version("1.0").build();
    }
}

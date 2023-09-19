package com.example.project03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Knife4jConfig {

    @Bean
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("swagger-student APIs")
                        .description("# student APIs")
                        .termsOfServiceUrl("http://www.xx.com/")
                        .contact(new Contact("fly", "http://www.xx.com/", "fly@qq.com"))
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("student")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.project03.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}

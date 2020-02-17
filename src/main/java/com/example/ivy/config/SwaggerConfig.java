package com.example.ivy.config;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 初始化创建Swagger Apis
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //详细信息定制
                .apiInfo(apiInfo())
                .select()
                //指定当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.ivy.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 摘要信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Springboot使用Swagger构建restful API")
                .description("描述：description")
                .contact(new Contact("ivy","www.baidu.com",""))
                .version("版本号：1.0")
                .build();
    }
}

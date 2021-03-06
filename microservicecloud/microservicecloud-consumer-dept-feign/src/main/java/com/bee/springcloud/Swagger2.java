/*
package com.bee.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

*/
/**
 * Created by yyzc on 2018/6/25.
 *//*

@Configuration  //表明它是一个配置类
@EnableSwagger2  //开启swagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bee.springcloud.controller"))   //指定扫描的包会生成文档
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {//配置一些基本的信息
        return new ApiInfoBuilder()
                .title("springCloud利用swagger构建api文档")
                .description("简单优雅的restful风格")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
*/

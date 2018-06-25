package com.bee.springcloud;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.google.common.base.Predicates;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Created by yyzc on 2018/6/25.
 */
@Configuration
@ComponentScan(basePackages = { "com.bee.springcloud.controller" })//配置controller路径
@EnableSwagger2
@SuppressWarnings({"unchecked","deprecation"})
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(Predicates.or( //这里添加你需要展示的接口
                       // PathSelectors.ant("/account/**"),
                        PathSelectors.ant("/consumer/dept/**")
                        )
                )
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springCloud利用swagger构建api文档")
                .description("简单优雅的restful风格")
                .contact(" 269056581@qq.com")
                .version("1.0")
                .build();
    }
}
package com.bee.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mervin on 2018/6/13.
 * 此类代替resoreces下的applicationContext.xml文件
 */
@Configuration
public class ConfigBean {//boot-->spring applicationContext.xml  ---@Configuration配置=applicationContext.xml
   @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}
//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
package com.bee.springcloud.controller;

import com.bee.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by mervin on 2018/6/13.
 * 消费者，不应有service层
 *
 * RestTemplate提供了多种便捷访问远程Http服务的方法
 * 是一种简单便捷的访问restful服务模块类，是Spring提供的用于访问Rest服务的客户端模板工具栏
 * */
@RestController
public class DeptController_Consumer {
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,ResponseBean.class)
     * 这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean  add(Dept dept){
       return restTemplate.postForObject(REST_URL_PREFIX+ "/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

}

package com.bee.springcloud.controller;

import com.bee.springcloud.entities.Dept;
import com.bee.springcloud.services.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }

}

package com.bee.springcloud.controller;

import com.bee.springcloud.entities.Dept;
import com.bee.springcloud.services.DeptClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mervin on 2018/6/13.
 * */
@RestController
@Api(description="部门接口")
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;

    Map<Long, Dept> books = Collections.synchronizedMap(new HashMap<Long, Dept>());

    @ApiOperation(value="获部门详细信息", notes="根据url的id来获取详细信息")
    @ApiImplicitParam(name = "id", value = "deptno", required = true, dataType = "Long",paramType = "path")
    @RequestMapping(value = "/consumer/dept/get/{id}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @ApiOperation(value="获取部门列表", notes="获取部门列表")
    @RequestMapping(value = "/consumer/dept/list",method= RequestMethod.GET)
    public List<Dept> list()
    {
        return this.service.list();
    }

    @ApiOperation(value="新增部门", notes="新增部门")
    @ApiImplicitParam(name = "dept", value = "部门详细实体", required = true, dataType = "Dept")
    //@ApiIgnore//使用该注解忽略这个API
    @RequestMapping(value = "/consumer/dept/add" ,method= RequestMethod.GET)
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }

}

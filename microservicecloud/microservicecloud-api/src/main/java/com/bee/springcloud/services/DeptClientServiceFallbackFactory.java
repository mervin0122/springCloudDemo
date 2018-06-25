/*
package com.bee.springcloud.services;

import com.bee.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
/**
*Hystrix断路器—服务降级
* /
@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	@Override
	public DeptClientService create(Throwable throwable)
	{
		return new DeptClientService() {
			@Override
			public Dept get(long id)
			{

                Dept dept=new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID：" + id + "没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                dept.setDb_source("no this database in MySQL");
                return  dept;
				//return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭").setDb_source("no this database in MySQL");
			}

			@Override
			public List<Dept> list()
			{
				return null;
			}

			@Override
			public boolean add(Dept dept)
			{
				return false;
			}
		};
	}
}
*/

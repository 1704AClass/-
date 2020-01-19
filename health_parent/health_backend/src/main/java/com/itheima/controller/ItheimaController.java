package com.itheima.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.ItheimaService;

@RequestMapping("/itheima")
@RestController
public class ItheimaController {
	@Reference
	private ItheimaService itheimaService;
	@RequestMapping("/loginName")
	public String loginName() {
		//安全框架直接获取用户名
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return name;
	}
}

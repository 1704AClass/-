package com.itheima.service;

import java.util.Map;

import entity.Result;

public interface OrderService {

	Result order(Map map) throws Exception;

	Map findById(Integer id) throws Exception;

}

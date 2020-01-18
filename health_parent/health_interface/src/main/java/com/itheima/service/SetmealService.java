package com.itheima.service;

import java.util.List;

import com.itheima.pojo.Setmeal;

import entity.PageResult;
import entity.QueryPageBean;

public interface SetmealService {

	List<Setmeal> findAll();

	Setmeal findById(Integer id);

	List<Integer> findSetmealIdAndCheckGroupId(Integer id);

	void edit(Setmeal setmeal, Integer[] checkGroupId);

	void dels(Integer id);

	PageResult pageQuery(QueryPageBean queryPageBean);

	void add(Setmeal setmeal, Integer[] checkGroupId);

	Setmeal findByid(int id);

}

package com.itheima.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckGroup;
import com.itheima.pojo.Setmeal;

public interface SetmealMapper {
	@Select("select * from t_setmeal")
	List<Setmeal> findAll();

	Setmeal findById(Integer id);

	List<Integer> findSetmealIdAndCheckGroupId(Integer id);

	void updateCheckGroupIdAndSetmealId(Map map);

	void edit(Setmeal setmeal);

	void add(Setmeal setmeal);

	void delsCheckGroupIdAndSetmealId(Integer id);

	void dels(Integer id);

	Page<CheckGroup> pageQuery(String queryString);

	Setmeal findByid(int id);

}

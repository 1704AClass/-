package com.itheima.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckGroup;

public interface CheckGroupMapper {
	//查询分页的列表
	Page<CheckGroup> pageQuery(String queryString);
	//添加检查组的单表
	void add(CheckGroup checkGroup);
	//对检查组合检查项中中间表的操作
	void updateCheckGroupIdAndCheckitemId(Map map);
	//删除检查组的单表信息
	void dels(Integer id);
	//删除是删除中间表的信息
	@Delete("delete from t_checkgroup_checkitem where checkgroup_id=#{id}")
	void delsCheckGroupIdAndCheckitemId(Integer id);
	//回显是用的方法
	CheckGroup findById(Integer id);
	//回显来显示中间表id的值
	List<Integer> findCheckItemIdsAndCheckGroupId(Integer id);
	//修改检查组的表
	void edit(CheckGroup checkGroup);
	//删除中间表
	void deleteAssocication(Integer id);
	//查询检查表单表
	@Select("select * from t_checkgroup")
	List<CheckGroup> findAll();

}

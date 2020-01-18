package com.itheima.mapper;

import com.github.pagehelper.Page;
import com.itheima.pojo.Member;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
    public List<Member> findAll();
    public Page<Member> selectByCondition(String queryString);
    public void add(Member member);
    public void deleteById(Integer id);
    public Member findById(Integer id);
    public Member findByTelephone(String telephone);
    public void edit(Member member);
    public Integer findMemberCountBeforeDate(String date);
    public Integer findMemberCountByDate(String date);
    public Integer findMemberCountAfterDate(String date);
    public Integer findMemberTotalCount();
    @Select("select * from t_member where name=#{username}")
	public Member findOne(String username);
}

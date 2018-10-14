package com.feri.dao;


import com.feri.domain.Authority;
import com.feri.domain.Role;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/6 09:35
 */
public interface AuthorityMapper {
    //新增
    int save(Authority authority);
    //删除
    int delete(int id);
    //查询分页
   // List<Authority> queryByPage(NoPageQo qo);
    @Select("select * from t_authority")
    @ResultType(Authority.class)
    List<Authority> queryAll();
    @Select("select r.* from t_role r left join t_roleauthority ra on ra.rid=r.id where ra.aid=#{id}")
    @ResultType(Role.class)
    List<Role> queryRole(int id);
    //查询数量
    BigInteger queryCount(String where);



}

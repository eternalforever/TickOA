package com.feri.service;



import com.feri.domain.Authority;
import com.feri.domain.Role;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/6 11:54
 */
public interface AuthorityService {
    //新增
    int save(Authority authority);
    //查询
   // List<Authority> queryByPage(NoPageQo qo);
    List<Authority> queryAll();
    List<Role> queryRole(int id);


}

package com.feri.service;



import com.feri.domain.Role;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/6 11:54
 */
public interface RoleService {
    //新增
    int save(Role role);
    //查询
    List<Role> queryAll();
    //修改角色对应的权限
    boolean updateAuth(int rid, int[] aids);
}

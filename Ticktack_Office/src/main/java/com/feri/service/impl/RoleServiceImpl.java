package com.feri.service.impl;

import com.feri.dao.RoleMapper;
import com.feri.domain.Role;
import com.feri.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/6 14:39
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper mapper;
    @Override
    public int save(Role role) {
        return mapper.save(role);
    }

    @Override
    public List<Role> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public boolean updateAuth(int rid, int[] aids) {
        try{
            mapper.delAuth(rid);
            for(int i=0;i<aids.length;i++){
                mapper.insertAuth(rid,aids[i]);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

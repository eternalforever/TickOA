package com.feri.service.impl;


import com.feri.dao.AuthorityMapper;
import com.feri.domain.Authority;
import com.feri.domain.Role;
import com.feri.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/6 14:43
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityMapper mapper;

    @Override
    public int save(Authority authority) {
        return mapper.save(authority);
    }

    @Override
    public List<Authority> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<Role> queryRole(int id) {
        return mapper.queryRole(id);
    }


}

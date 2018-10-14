package com.feri.web.controller;

import com.feri.common.vo.PageVo;
import com.feri.domain.Role;
import com.feri.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/12 15:35
 */
@Controller
public class RoleController {
    @Autowired
    private RoleService service;

    @RequestMapping("roleall")
    @ResponseBody
    public List<Role> queryAll(){
        return service.queryAll();
    }
}

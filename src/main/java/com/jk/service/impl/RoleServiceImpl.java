package com.jk.service.impl;

import com.jk.dao.RoleMapper;
import com.jk.model.Role;
import com.jk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> roleList(Role role) {
        return roleMapper.roleList(role);
    }
}

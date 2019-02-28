package com.jk.service;

import com.jk.model.Role;

import java.util.List;

public interface RoleService {
    /**
     * 角色列表查询
     * @param role
     * @return
     */
    public List<Role> roleList(Role role);
}

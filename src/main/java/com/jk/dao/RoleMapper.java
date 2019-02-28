package com.jk.dao;

import com.jk.model.Role;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
     /**
     * 查询角色列表
     * @param
     * @return
     */
     @Select("SELECT * FROM aoa_role_")
     @Results({
             @Result(property = "roleId",  column = "role_id"),
             @Result(property = "roleName", column = "role_name"),
             @Result(property = "roleValue", column = "role_value")
     })
     public  List<Role>  roleList(Role role);
}

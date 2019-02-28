package com.jk.controller;

import com.jk.model.Role;
import com.jk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

   @Autowired
    private RoleService  roleService;

  @RequestMapping("/roleList")
   public List<Role> roleList(Role role){
       return  roleService.roleList(role);
   }
}

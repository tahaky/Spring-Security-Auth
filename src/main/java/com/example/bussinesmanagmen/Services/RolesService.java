package com.example.bussinesmanagmen.Services;

import com.example.bussinesmanagmen.Repositorys.RoleRepostory;
import com.example.bussinesmanagmen.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolesService {
    @Autowired
    RoleRepostory roleRepostory;

    public Optional<Role> findConsumerRoleByRoleName(String name){
        return this.roleRepostory.findConsumerRoleByRoleName(name);
    }

}

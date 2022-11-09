package com.example.bussinesmanagmen.Repositorys;

import com.example.bussinesmanagmen.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RoleRepostory extends JpaRepository<Role, Short> {
    Optional<Role> findConsumerRoleByRoleName(String name);

    @Query(value = "SELECT * FROM roles WHERE rolename=1?", nativeQuery = true)
    Optional<Role> findByRoleName(String rolename);
}

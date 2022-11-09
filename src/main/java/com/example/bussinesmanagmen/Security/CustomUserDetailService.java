package com.example.bussinesmanagmen.Security;

import com.example.bussinesmanagmen.Repositorys.UserRepostory;
import com.example.bussinesmanagmen.entity.Role;
import com.example.bussinesmanagmen.entity.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailService implements UserDetailsService {
    private UserRepostory userRepostory;

    @Autowired
    public CustomUserDetailService(UserRepostory userRepostory) {
        this.userRepostory = userRepostory;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel userModel = userRepostory.getUserModelByEmail(email);
        return new User(
                userModel.getEmail(), userModel.getPassword(), MapRolesToAuthorities(userModel.getRole()));
    }

    private List<GrantedAuthority> MapRolesToAuthorities(List<Role> roles) {
        return roles
                .stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
    }
}

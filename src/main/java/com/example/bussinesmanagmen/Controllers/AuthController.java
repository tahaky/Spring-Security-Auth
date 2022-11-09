package com.example.bussinesmanagmen.Controllers;

import com.example.bussinesmanagmen.Repositorys.RoleRepostory;
import com.example.bussinesmanagmen.Repositorys.UserRepostory;
import com.example.bussinesmanagmen.entity.RegisterModel;
import com.example.bussinesmanagmen.entity.Role;
import com.example.bussinesmanagmen.entity.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth/")
public class AuthController {
    private AuthenticationManager authenticationManager;
    private UserRepostory userRepostory;
    private RoleRepostory roleRepostory;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager,
                          UserRepostory userRepostory,
                          RoleRepostory roleRepostory,
                          PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.userRepostory = userRepostory;
        this.roleRepostory = roleRepostory;
        this.passwordEncoder = passwordEncoder;
    }


    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody RegisterModel registerModel) {
        UserModel userModel = new UserModel();
        userModel.setEmail(registerModel.getEmail());
        userModel.setPassword(passwordEncoder.encode(registerModel.getPassword()));
        System.out.println(userModel.getPassword());
        Role role = roleRepostory.findByRoleName("USER").get();
        System.out.println(role.getRoleName());


        userRepostory.save(userModel);
        return new ResponseEntity<>("User register Success", HttpStatus.OK);
    }
}

package com.example.bussinesmanagmen.Repositorys;

import com.example.bussinesmanagmen.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepostory extends JpaRepository<UserModel, Integer> {
    @Query(value = "SELECT * FROM ROLE WHERE EMAİL",nativeQuery = true)
    UserModel getUserModelByEmail(String email);
}

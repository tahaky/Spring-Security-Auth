package com.example.bussinesmanagmen.Repositorys;

import com.example.bussinesmanagmen.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepostory extends JpaRepository<Country,Long> {

}

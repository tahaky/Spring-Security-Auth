package com.example.bussinesmanagmen.Repositorys;

import com.example.bussinesmanagmen.entity.Adress;
import org.apache.tomcat.jni.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepostory extends JpaRepository<Adress,Long> {
}

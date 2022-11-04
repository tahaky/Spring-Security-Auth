package com.example.bussinesmanagmen.Services;

import com.example.bussinesmanagmen.Repositorys.AddressRepostory;
import com.example.bussinesmanagmen.entity.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepostory addressRepostory;

    public List<Adress> getAllAdress(){
        return this.addressRepostory.findAll();
    }
}

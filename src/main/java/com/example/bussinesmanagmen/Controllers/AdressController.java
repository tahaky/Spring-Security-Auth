package com.example.bussinesmanagmen.Controllers;

import com.example.bussinesmanagmen.Services.AddressService;
import com.example.bussinesmanagmen.entity.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("adress/all")
    List<Adress> getAllAdress(){
        return addressService.getAllAdress();
    }
}

package com.example.bussinesmanagmen.Services;

import com.example.bussinesmanagmen.Repositorys.AddressRepostory;
import com.example.bussinesmanagmen.Repositorys.CountryRepostory;
import com.example.bussinesmanagmen.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepostory countryRepostory;

    public List<Country> getAllCountries(){
        return this.countryRepostory.findAll();
    }

}

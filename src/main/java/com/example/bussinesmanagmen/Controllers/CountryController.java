package com.example.bussinesmanagmen.Controllers;

import com.example.bussinesmanagmen.Services.CountryService;
import com.example.bussinesmanagmen.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/country/all")
    List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

}

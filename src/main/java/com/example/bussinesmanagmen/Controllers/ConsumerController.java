package com.example.bussinesmanagmen.Controllers;

import com.example.bussinesmanagmen.Services.ConsumerService;
import com.example.bussinesmanagmen.entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("consumer/all")
    List<Consumer> getAllConsumers() {
        return this.consumerService.getAllConsumers();
    }


}

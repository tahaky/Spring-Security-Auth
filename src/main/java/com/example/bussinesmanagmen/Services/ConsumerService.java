package com.example.bussinesmanagmen.Services;

import com.example.bussinesmanagmen.entity.Consumer;
import com.example.bussinesmanagmen.Repositorys.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {
    @Autowired
   private ConsumerRepository consumerRepository;

    public List<Consumer> getAllConsumers() {
        return consumerRepository.findAll();
    }

}

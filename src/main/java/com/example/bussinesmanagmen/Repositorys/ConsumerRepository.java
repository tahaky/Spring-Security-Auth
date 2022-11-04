package com.example.bussinesmanagmen.Repositorys;

import com.example.bussinesmanagmen.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer,Long> {
}

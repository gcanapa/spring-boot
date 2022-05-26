package com.br.springboot.repository;

import java.util.List;

import com.br.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long>{
    
    @Query("SELECT u from User u where u.id > :id")
    public List<User> findAllMoreThan(@Param("id") Long id);
    //Aqui ele está fazendo o mesmo select que a query de cima 
    public List<User> findByIdGreaterThan(Long id);
    //Aqui está fazendo um select baseado no nome passado na url
    public List<User> findByNameIgnoreCase(String name);
}

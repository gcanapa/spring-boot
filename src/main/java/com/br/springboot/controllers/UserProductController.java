package com.br.springboot.controllers;

import java.util.List;
import java.util.Optional;
import com.br.springboot.model.UserProducts;
import com.br.springboot.repository.UserProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class UserProductController {
    
    @Autowired
    private UserProductRepository userProductRepository;

    @PostMapping("/")
    public UserProducts userProduct(@RequestBody UserProducts userProduct){
        return this.userProductRepository.save(userProduct);
    }

    @GetMapping("/findById/{id}")
    public UserProducts findById(@PathVariable("id") Long id){
        Optional<UserProducts> productFind = this.userProductRepository.findById(id);
        if(productFind.isPresent()){
            return productFind.get();
        }
        return null;
    }

    @GetMapping("/findProductByIdUser/{id}")
    public List<UserProducts> findProductByIdUser(@PathVariable("id") Integer id) {
        List<UserProducts> productFindByUsersId = this.userProductRepository.findProductByIdUser(id);
        if(!productFindByUsersId.isEmpty()){
            return productFindByUsersId;
        }
        return null;
    }
}

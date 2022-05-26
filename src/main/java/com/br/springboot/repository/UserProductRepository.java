package com.br.springboot.repository;

import java.util.List;
import com.br.springboot.model.UserProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserProductRepository extends JpaRepository<UserProducts, Long> {
    

    public List<UserProducts> findProductById(Long id);

    @Query("SELECT u FROM UserProducts u WHERE u.users_id.id = :id_user")
    public List<UserProducts> findProductByIdUser(@Param("id_user") Integer id_user);
}

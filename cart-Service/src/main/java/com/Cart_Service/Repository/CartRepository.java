package com.Cart_Service.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.Cart_Service.Entity.Cart;

@Repository
public class CartRepository extends JpaRepository<Cart,Long>{
    
    List<Cart>findByUserId(long userId);    

    
}

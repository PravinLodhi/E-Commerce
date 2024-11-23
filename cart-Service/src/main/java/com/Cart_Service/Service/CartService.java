package com.Cart_Service.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Cart_Service.Entity.Cart;
import com.Cart_Service.Repository.CartRepository;

public class CartService {


    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private UserServiceClient userClientService;

    @Autowired
    private ProductServiceClient productServiceClient;

    public String addItems(long userId, long productId, int itemQuantity) {
        userInfoDTO getuser = userClientService.getUserByid(userId);
        if (getuser == null) {
            return "User Not Found";
        }

        productDTO getproduct = productServiceClient.getById(productId);

        if (getproduct == null) {
            return "product is not Found";
        }

        Cart cart = new Cart();
        cart.setUserId(userId);
        cart.setProductId(productId);
        cart.setQuantity(itemQuantity);
        cart.setItemDescription(getproduct.getDescription());
        cart.setStatus("A");
        cart.setCost(getproduct.getPrice() * itemQuantity);
        cartRepo.save(cart);
        return "Item Added in Cart";
    }

}
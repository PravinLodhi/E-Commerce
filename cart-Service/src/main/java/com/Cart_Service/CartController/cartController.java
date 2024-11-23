package com.Cart_Service.CartController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Cart_Service.CartServiceApplication;
import com.Cart_Service.Entity.Cart;
import com.Cart_Service.Service.CartService;

@RestController
public class cartController {

    private CartService cartService;

@PostMapping("/addtocart")
public ResponseEntity<String> addItemsToCart(@RequestParam String userId, @RequestParam String productId, @RequestParam int quantity){ String result = cartService.addItems (userId, productId, quantity);

if(result.equals("Item Added in Cart")) { return ResponseEntity.ok(result);

}

return ResponseEntity.status(400).body (result);

}

// @GetMapping("/retrieveUserCart") public List<Cart> retrieveCart(){
// List<Cart> retrieveUserCart = cartService.retrieveUserCart();

// return retrieveUserCart;

// }

// //

    

    
}

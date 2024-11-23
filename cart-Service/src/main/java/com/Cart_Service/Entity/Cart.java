package com.Cart_Service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long userId;
    private long productId;
    private String ItemDecription;
    private int quantity;
    private double cost;
    private String status;


    public Cart() {
        super();
    }

    


    public Cart(int id, long userId, long productId, String itemDecription, int quantity, double cost, String status) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        ItemDecription = itemDecription;
        this.quantity = quantity;
        this.cost = cost;
        this.status = status;
    }
    
    public void setId(int id) {
        this.id = id;
    }


    public void setUserId(long userId) {
        this.userId = userId;
    }


    public void setProductId(long productId) {
        this.productId = productId;
    }


    public void setItemDecription(String itemDecription) {
        ItemDecription = itemDecription;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setCost(double cost) {
        this.cost = cost;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public long getUserId() {
        return userId;
    }


    public long getProductId() {
        return productId;
    }


    public String getItemDecription() {
        return ItemDecription;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getCost() {
        return cost;
    }


    public String getStatus() {
        return status;
    }


    

    
}

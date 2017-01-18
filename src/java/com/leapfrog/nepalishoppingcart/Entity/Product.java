/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.Entity;

/**
 *
 * @author Shreeson Shrestha
 */
public class Product {
    private int product_id;
    private String product_name;
    private int product_qty;
    private int product_price;
    private String category;

    public Product() {
    }

    
    
    public Product(int product_id, String product_name,int product_price,String category,int qty) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price=product_price;
        this.category=category;
        this.product_qty=qty;
    }

    
    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_qty=" + product_qty + ", product_price=" + product_price + ", category=" + category + '}';
    }

    
    

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.DAO.impl;

import com.leapfrog.nepalishoppingcart.DAO.ProductDAO;
import com.leapfrog.nepalishoppingcart.Entity.Product;
import com.leapfrog.nepalishoppingcart.controller.Setcontroller;
import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Shreeson Shrestha
 */
@Repository(value="ProductDAO")
public class productdaoimpl implements ProductDAO {
    Setcontroller sctrl=new Setcontroller();
    Set<Product> productset = new LinkedHashSet<>();
    Product p1 = new Product(1,"Pencil",5);
    Product p2 = new Product(2,"Pen",60);
    Product p3 = new Product(3,"Copy",80);
    Product p4 = new Product(4,"Java Programming for Beginners",550);

    @Override
    public Set<Product> getall() {
        productset = new LinkedHashSet<>();
        productset.add(p1);
        productset.add(p2);
        productset.add(p3);
        productset.add(p4);
        return productset;
    }

    @Override
    public Product getbyId(int id) {
        for (Product p : getall()) {
            if (p.getProduct_id() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "productdaoimpl{" + "sctrl=" + sctrl + ", productset=" + productset + ", p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
    }
    
    
}
 
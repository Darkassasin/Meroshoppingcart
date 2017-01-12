/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.DAO;

import com.leapfrog.nepalishoppingcart.Entity.Product;
import java.util.Set;

/**
 *
 * @author Shreeson Shrestha
 */
public interface ListDAO {
    void add(Set<Product> list,Product p);
    void remove(Set<Product> list,int id);
}

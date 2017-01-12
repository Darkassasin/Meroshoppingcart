/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import com.leapfrog.nepalishoppingcart.DAO.ListDAO;
import com.leapfrog.nepalishoppingcart.Entity.Product;
import java.util.Set;

/**
 *
 * @author Shreeson Shrestha
 */
public class Setcontroller implements ListDAO{

    @Override
    public void add(Set<Product> set, Product p) {
        set.add(p);
    }

    @Override
    public void remove(Set<Product> set, int id) {
        set.remove(id);
    }
}

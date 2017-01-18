/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import com.leapfrog.nepalishoppingcart.DAO.ProductDAO;
import com.leapfrog.nepalishoppingcart.Entity.Product;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Shreeson Shrestha
 */
@RequestMapping(value = "/admin/add")
public class FormController {
    @Autowired
    private ProductDAO productDAO;
     @RequestMapping(method = RequestMethod.POST)
    public String save(@ModelAttribute("add") Product product) {
        try {
            productDAO.insert(product);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
        return "admin";
    }
}

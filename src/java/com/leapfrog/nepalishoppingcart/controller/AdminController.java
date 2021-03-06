/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import com.leapfrog.nepalishoppingcart.DAO.ProductDAO;
import com.leapfrog.nepalishoppingcart.Entity.Product;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Shreeson Shrestha
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index() {
        return "admin/index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String index(HttpServletRequest req) {
        req.getSession(false).invalidate();
        return "index";
    }
    
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public  String save(@ModelAttribute("add") Product product) {
        try {
            productDAO.insert(product);
        } catch (ClassNotFoundException | SQLException ex) {

        }
        return "admin/index";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import com.leapfrog.nepalishoppingcart.DAO.ProductDAO;
import com.leapfrog.nepalishoppingcart.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Shreeson Shrestha
 */
@Controller
@RequestMapping(value="/")
public class DefaultController {
   @Autowired
   private ProductDAO productDAO;
   
   @RequestMapping(method = RequestMethod.GET)
   public String index(ModelMap map){
       Product p= new Product(1,"Acer aspire 5742",80000);
       System.out.println(productDAO.getall());
       map.addAttribute("products",productDAO.getall());
      //map.addAttribute("pro", productDAO.getall());
       return "index";
   }
  
}

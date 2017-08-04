/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import com.leapfrog.nepalishoppingcart.DAO.ProductDAO;
import com.leapfrog.nepalishoppingcart.Entity.Product;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
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
           map.addAttribute("products",productDAO.getall());
       return "index";
   }
   
     @RequestMapping(value="/logout",method = RequestMethod.GET)
   public String index(HttpServletRequest req){
       req.getSession(false).invalidate();
       return "redirect:/";
   }
}

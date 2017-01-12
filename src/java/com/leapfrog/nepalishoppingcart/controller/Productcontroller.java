/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import com.leapfrog.nepalishoppingcart.DAO.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Shreeson Shrestha
 */
@Controller
@RequestMapping(value = "/product")
public class Productcontroller {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping(value = "/{id}")
    public String detail(ModelMap map, @PathVariable("id") int id) {
        map.addAttribute("product", productDAO.getbyId(id));
        return "product/detail";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Shreeson Shrestha
 */
@Controller
@RequestMapping(value="/cart")
public class CartController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String index(){
        
    return "/cart/items";
    }
}

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
@RequestMapping(value="/login")
public class LoginController {
    
   @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "login";
    }
     @RequestMapping(method = RequestMethod.POST)
    public String index2(){
        return "admin/index";
    }
}
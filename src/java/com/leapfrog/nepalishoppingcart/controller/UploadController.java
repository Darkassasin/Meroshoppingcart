/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author shree
 */
@Controller
public class UploadController {
    

@RequestMapping(value="/uploadimage",method = RequestMethod.GET)
    public String index() {
        return "upload";
    }
    
@RequestMapping(value = "/upload/{file}", method = RequestMethod.POST)
public String handleFormUpload(@RequestParam("file") MultipartFile file) throws IOException{
if (!file.isEmpty()) {
 BufferedImage src = ImageIO.read(new ByteArrayInputStream(file.getBytes()));
 File destination = new File("D:\\meroshopping\\Meroshoppingcart\\web\\WEB-INF\\uploads"+file.getName()); // something like C:/Users/tom/Documents/nameBasedOnSomeId.png
 ImageIO.write(src, "png", destination);
 //Save the id you have used to create the file name in the DB. You can retrieve the image in future with the ID.
 }  
    return "upload";
}
}

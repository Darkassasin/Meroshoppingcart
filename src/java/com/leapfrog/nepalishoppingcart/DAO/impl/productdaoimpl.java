/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.nepalishoppingcart.DAO.impl;

import com.leapfrog.nepalishoppingcart.DAO.ProductDAO;
import com.leapfrog.nepalishoppingcart.Entity.Product;
import com.leapfrog.nepalishoppingcart.controller.Setcontroller;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Shreeson Shrestha
 */
@Repository(value="ProductDAO")
public class productdaoimpl implements ProductDAO {
    Setcontroller sctrl=new Setcontroller();
    Set<Product> productset = new LinkedHashSet<>();

    @Autowired
    private JdbcTemplate JdbcTemplate;
    @Override
    public Set<Product> getall() {
        List<Product> productlist=new ArrayList<>();
        String sql="SELECT * FROM tbl_product";
        productlist=JdbcTemplate.query(sql,new RowMapper<Product>(){

            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                        Product product= new Product();
                        product.setProduct_id(rs.getInt("id"));
                        product.setProduct_name(rs.getString("name"));
                        product.setProduct_qty(rs.getInt("qty"));
                        product.setProduct_price(rs.getInt("rate"));
                        product.setCategory(rs.getString("category"));
                        return product;
            }
        });
        productset = new LinkedHashSet<>(productlist);
        return productset;
    }

    @Override
    public Product getbyId(int id) {
        for (Product p : getall()) {
            if (p.getProduct_id() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public int insert(Product p) throws ClassNotFoundException, SQLException {
       String sql="INSERT INTO tbl_product(name,rate,category,qty) VALUES(?,?,?,?)";
       Object[] obj={p.getProduct_name(),p.getProduct_price(),p.getCategory(),p.getProduct_qty()};
       return JdbcTemplate.update(sql,obj);
    }
    
    public int upload(Product p) throws ClassNotFoundException, SQLException{
       String sql="INSERT INTO tbl_upload(image) VALUES(?)";
       Object[] obj={p.getFile()};
       return JdbcTemplate.update(sql,obj);
    }
}
 
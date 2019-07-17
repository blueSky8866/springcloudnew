package com.qianfeng.productservice.controller;

import com.qianfeng.entity.TProduct;
import com.qianfeng.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("list")
    public List<TProduct> list(){
        return productService.list();
    }
    @GetMapping("getById/{id}")
    public TProduct getyId(@PathVariable("id") Long id){
        return productService.getById(id);
    }
}

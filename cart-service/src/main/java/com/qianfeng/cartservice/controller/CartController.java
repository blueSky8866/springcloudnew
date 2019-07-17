package com.qianfeng.cartservice.controller;

import com.qianfeng.cartservice.interfaces.ProductService;
import com.qianfeng.cartservice.service.ICartService;
import com.qianfeng.entity.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ICartService cartService;
    @Autowired
    private ProductService productService;
    //private String PRODUCT_SERVICE_URL = "http://localhost:8082/product/getById";
    //private String PRODUCT_SERVICE_URL = "http://PRODUCT-SERVICE/product/getById";

    @GetMapping("getById/{id}")
    public TProduct getById(@PathVariable("id") Long id){
        //RestTemplate restTemplate =new RestTemplate();
        //TProduct product = restTemplate.getForObject(PRODUCT_SERVICE_URL+"/"+id, TProduct.class);
       //走的还是http协议，伪RPC的方式
        //构建一个url
        //http://PRODUCT_SERVICE_URL/product/getById/{id};
        TProduct product = productService.getyId(id);
        return product;
    }
    @GetMapping("list")
    public List<TProduct> getlist(){

        //走的还是http协议，伪RPC的方式
        List<TProduct> list = productService.list();
        return list;
    }

}

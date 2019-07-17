package com.qianfeng.cartservice.interfaces;

import com.qianfeng.entity.TProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "PRODUCT-SERVICE",fallback = ProductService.ProductServiceFallback.class)
public interface ProductService {
    @GetMapping("product/getById/{id}")
    public TProduct getyId(@PathVariable("id") Long id);
    @GetMapping("product/list")
    public List<TProduct> list();
    @Component
    static class ProductServiceFallback implements ProductService{

        @Override
        public TProduct getyId(Long id) {
            return new TProduct(id,"暂无数据",1L);
        }

        @Override
        public List<TProduct> list() {
            return new ArrayList<>();
        }
    }
}

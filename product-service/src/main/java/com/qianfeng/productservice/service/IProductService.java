package com.qianfeng.productservice.service;

import com.qianfeng.entity.TProduct;

import java.util.List;

public interface IProductService {
    List<TProduct> list();


    TProduct getById(Long id);
}

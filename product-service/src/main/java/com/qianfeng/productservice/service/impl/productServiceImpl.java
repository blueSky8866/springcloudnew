package com.qianfeng.productservice.service.impl;

import com.qianfeng.entity.TProduct;
import com.qianfeng.productservice.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productServiceImpl implements IProductService {
    @Override
    public List<TProduct> list() {
        List<TProduct> list =new ArrayList<>();
        list.add(new TProduct(1L,"哈登",888L));
        list.add(new TProduct(2L, "格里芬", 999L));
        return list;
    }

    @Override
    public TProduct getById(Long id) {
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return new TProduct(id,"唐宋",222L);
    }


}

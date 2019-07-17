package com.qianfeng.entity;

public class TProduct {
    private String name;
    private Long id;
    private Long price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public TProduct(Long id, String name, Long price) {

        this.name = name;
        this.id = id;
        this.price = price;
    }

    public TProduct() {
    }
}

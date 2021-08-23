package com.company.stream_api;


import java.util.UUID;

public class Product {
    private String productCode;
    private String productName;
    private String category;
    private Double price;
    private Integer ramSize;

    public Product(String productName, String category,
                   Double price, Integer ramSize) {
        this.productCode = UUID.randomUUID().toString().substring(0,8);
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.ramSize = ramSize;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }
}

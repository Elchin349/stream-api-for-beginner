package com.company.stream_api;

public class ProductMapper {

    public static ProductResponse mapToResponse(Product product){
        ProductResponse response = new ProductResponse();
        response.setProductName(product.getProductName());
        response.setProductCode(product.getProductCode());
        response.setCategory(product.getCategory());
        response.setPrice(product.getPrice());
        response.setRamSize(product.getRamSize());
        return response;
    }
}

package com.company.stream_api;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterProducts {

    public static List<ProductResponse> filterNullValues() {
        return ProductData.data()
                .stream()
                .filter(Objects::nonNull)
                .map(ProductMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    public static List<ProductResponse> filterPriceBigThan(Double price) {
        return ProductData.data()
                .stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getPrice() >= price)
                .map(ProductMapper::mapToResponse)
                .collect(Collectors.toList());

    }

    public static List<ProductResponse> filterPriceLessThan(Double price) {
        return ProductData.data()
                .stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getPrice() < price)
                .map(ProductMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    public static List<ProductResponse> filterPriceLessThanAndCategory(Double price, String category) {
        return ProductData.data()
                .stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getPrice() < price && product.getCategory().contains(category))
                .map(ProductMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    public static List<ProductResponse> filterPriceBigThanAndCategory(Double price, String category) {
        return ProductData.data()
                .stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getPrice() >= price && product.getCategory().contains(category))
                .map(ProductMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    public static List<ProductResponse> filterByCategory(String category) {
        return ProductData.data()
                .stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getCategory().contains(category))
                .map(ProductMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    public static List<ProductResponse> filterByName(String name) {
        return ProductData.data()
                .stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getProductName().contains(name))
                .map(ProductMapper::mapToResponse)
                .collect(Collectors.toList());
    }
}

package com.company.stream_api;

import java.util.ArrayList;
import java.util.List;

public interface ProductData {
    static List<Product> data() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Samsung S21", "Mobile", 1899.0, 8));
        products.add(new Product("Samsung S21 Ultra", "Mobile", 2899.0, 12));
        products.add(null);
        products.add(null);
        products.add(new Product("Samsung A30", "Mobile", 399.0, 3));
        products.add(new Product("Samsung A51", "Mobile", 589.0, 4));
        products.add(new Product("Samsung A71", "Mobile", 889.0, 6));
        products.add(new Product("Iphone 12 Pro Max 512", "Mobile", 3769.0, 6));
        products.add(new Product("Iphone 12 Pro 512", "Mobile", 3499.0, 6));
        products.add(new Product("Iphone 11 Pro", "Mobile", 2299.0, 6));
        products.add(new Product("Xiaomi Poco f3", "Mobile", 1049.0, 6));
        products.add(new Product("Xiaomi Poco M3", "Mobile", 359.0, 4));
        products.add(new Product("Xiaomi Note 9", "Mobile", 299.0, 3));
        products.add(new Product("Xiaomi Redmi 9A", "Mobile", 239.0, 2));
        products.add(new Product("Ipad 8", "Tab", 799.0, 3));
        products.add(new Product("Ipad Air 4", "Tab", 1499.0, 4));
        products.add(new Product("Samsung Galaxy tab", "Tab", 479.0, 3));
        products.add(new Product("Hp", "Laptop", 649.0, 4));
        products.add(new Product("MacBook Pro", "Laptop", 4099.0, 16));
        products.add(new Product("Acer Predator", "Laptop", 3299.0, 16));
        products.add(new Product("Lenovo", "Laptop", 1799.0, 8));
        products.add(new Product("Dell", "Laptop", 1599.0, 8));
        products.add(new Product("Acer A315", "Laptop", 1199.0, 8));
        return products;
    }
}
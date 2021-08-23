package com.company.stream_api;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();

    }

    public static void start(){
        selectFromMenu();
        start();
    }

    public static void menu() {
        System.out.println();
        System.out.println("SHOW ALL PRODUCTS                                   - 1");
        System.out.println("SHOW PRODUCTS BY NAME                               - 2");
        System.out.println("SHOW PRODUCTS BY CATEGORY                           - 3");
        System.out.println("SHOW PRODUCTS BY CATEGORY AND BIG THAN PRICE        - 4");
        System.out.println("SHOW PRODUCTS BY CATEGORY AND LESS THAN PRICE       - 5");
        System.out.println("SHOW PRODUCTS BIG THAN PRICE                        - 6");
        System.out.println("SHOW PRODUCTS SMALL THAN PRICE                      - 7\n");
    }

    public static void selectFromMenu() {
        menu();
        String select = scanner.nextLine();
        checkSelect(select);
    }

    public static void checkSelect(String select) {
        switch (select) {
            case "1" -> printResponse(FilterProducts.filterNullValues());
            case "2" -> printResponse(byName());
            case "3" -> printResponse(byCategory());
            case "4" -> printResponse(byCategoryAndPriceBigThan());
            case "5" -> printResponse(byCategoryAndPriceLessThan());
            case "6" -> printResponse(byPriceBigThan());
            case "7" -> printResponse(byPriceLessThan());
        }
    }

    public static List<ProductResponse> byName() {
        System.out.println("Enter Name");
        return FilterProducts.filterByName(scanner.nextLine());
    }

    public static List<ProductResponse> byCategory() {
        System.out.println("Enter Category");
        return FilterProducts.filterByCategory(scanner.nextLine());
    }

    public static List<ProductResponse> byCategoryAndPriceBigThan() {
        System.out.println("Enter Category");
        String category = scanner.nextLine();
        System.out.println("Enter Price");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return FilterProducts.filterPriceBigThanAndCategory(price, category);
    }

    public static List<ProductResponse> byCategoryAndPriceLessThan() {
        System.out.println("Enter Category");
        String category = scanner.nextLine();
        System.out.println("Enter Price");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return FilterProducts.filterPriceLessThanAndCategory(price, category);
    }

    public static List<ProductResponse> byPriceLessThan() {
        System.out.println("Enter Price");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return FilterProducts.filterPriceLessThan(price);
    }

    public static List<ProductResponse> byPriceBigThan() {
        System.out.println("Enter Price");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return FilterProducts.filterPriceBigThan(price);
    }

    public static void printResponse(List<ProductResponse> productResponses) {
        System.out.println(productResponses);
    }

}

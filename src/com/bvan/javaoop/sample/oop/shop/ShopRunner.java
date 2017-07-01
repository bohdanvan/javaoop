package com.bvan.javaoop.sample.oop.shop;

/**
 * @author bvanchuhov
 */
public class ShopRunner {

    public static void main(String[] args) {
        User user = new User("John", new Account(12_000));

        user.addProduct(new Product("MacBook", 2000), 2);
        user.addProduct(new Product("Lenovo", 1500), 3);

        user.payForCurrentOrder();

        System.out.println("remainingMoney = " + user.getRemainingMoney()); // 3500
        System.out.println("completedOrders = " + user.getCompletedOrders());
    }
}

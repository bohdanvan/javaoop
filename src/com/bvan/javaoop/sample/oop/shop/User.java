package com.bvan.javaoop.sample.oop.shop;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author bvanchuhov
 */
public class User {

    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final Account account;
    private final List<Order> completedOrders = new ArrayList<>();
    private Order currentOrder = new Order();

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void addProduct(Product product, int count) {
        currentOrder.addItem(product, count);
    }

    public boolean payForCurrentOrder() {
        long price = currentOrder.getPrice();
        boolean success = account.withdraw(price);

        if (!success) {
            return false;
        }

        currentOrder.setPayedTime(LocalTime.now());
        completedOrders.add(currentOrder);

        currentOrder = new Order();

        return true;
    }

    public long getRemainingMoney() {
        return account.getMoney();
    }

    public List<Order> getCompletedOrders() {
        return completedOrders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

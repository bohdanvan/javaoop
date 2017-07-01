package com.bvan.javaoop.sample.oop.shop;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author bvanchuhov
 */
public class Order {

    private final String id = UUID.randomUUID().toString();
    private final List<OrderItem> items = new ArrayList<>();
    private final LocalTime createdTime = LocalTime.now();
    private LocalTime payedTime;

    public long getPrice() {
        long price = 0;
        for (OrderItem item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public void addItem(Product product, int count) {
        items.add(new OrderItem(product, count));
    }

    public void setPayedTime(LocalTime payedTime) {
        this.payedTime = payedTime;
    }

    public String getId() {
        return id;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public LocalTime getPayedTime() {
        return payedTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", items=" + items +
                ", createdTime=" + createdTime +
                ", payedTime=" + payedTime +
                '}';
    }
}

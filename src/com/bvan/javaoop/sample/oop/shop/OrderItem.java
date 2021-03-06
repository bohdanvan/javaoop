package com.bvan.javaoop.sample.oop.shop;

/**
 * @author bvanchuhov
 */
public class OrderItem {

    private final Product product;
    private int count;

    public OrderItem(Product product, int count) {
        checkCount(count);

        this.product = product;
        this.count = count;
    }

    public OrderItem(Product product) {
        this(product, 1);
    }

    public long getPrice() {
        return product.getPrice() * count;
    }

    public void incCount() {
        count++;
    }

    public void decCount() {
        if (count == 0) {
            throw new IllegalStateException("Can't decrease zero count");
        }
        count--;
    }

    public void setCount(int count) {
        checkCount(count);
        this.count = count;
    }

    private void checkCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Illegal count: " + count);
        }
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", count=" + count +
                '}';
    }
}

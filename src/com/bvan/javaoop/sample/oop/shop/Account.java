package com.bvan.javaoop.sample.oop.shop;

/**
 * @author bvanchuhov
 */
public class Account {

    private long money;

    public Account(long initMoney) {
        if (initMoney < 0) {
            throw new IllegalArgumentException("negative money quantity: " + initMoney);
        }

        this.money = initMoney;
    }

    public boolean withdraw(long count) {
        if (money < count) {
            return false;
        }

        money -= count;
        return true;
    }

    public void debit(long count) {
        money += count;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}

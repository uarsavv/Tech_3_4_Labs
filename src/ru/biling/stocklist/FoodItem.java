package ru.biling.stocklist;

import java.time.LocalDate;
import java.util.Date;

public class FoodItem extends GenereticItem implements Cloneable {
    public LocalDate dateOfIncome;
    public short expires;
    public String name;
    public float price;
    public Date date;

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.date = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        super(name, price, Category.GENERAL);
        this.expires = expires;
    }

    public FoodItem(String name) {
        super(name, 0.0F, Category.GENERAL);
    }

    public boolean equals(FoodItem o) {
        return this.dateOfIncome == o.dateOfIncome & this.expires == o.expires;
    }

    public void work() {
        System.out.printf("DateOfIncome: %-10s, expires: %d \n", this.dateOfIncome, this.expires);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        String var10000 = String.valueOf(this.dateOfIncome);
        return "FoodItem{dateOfIncome=" + var10000 + ", expires=" + this.expires + "}";
    }
}
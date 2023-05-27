package ru.biling.stocklist;

public class GenereticItem {
    public int ID;
    public String name;
    public float price;
    public Category category1;
    static int currentID;
    public GenereticItem analogue;

    public GenereticItem(String name, float price, Category category) {
        this.category1 = Category.GENERAL;
        this.name = name;
        this.price = price;
        this.category1 = category;
        this.ID = currentID++;
    }

    public GenereticItem(String name, float price, GenereticItem analog) {
        this.category1 = Category.GENERAL;
        this.name = name;
        this.price = price;
        this.analogue = analog;
        this.ID = currentID++;
    }

    public GenereticItem() {
        this.category1 = Category.GENERAL;
        this.ID = currentID++;
    }

    public void printAll() {
        System.out.printf("ID: %d, Name: %-20s , price:%5.2f, category: %-20s \n", this.ID, this.name, this.price, this.category1);
    }

    public boolean equals(GenereticItem o) {
        return this.ID == o.ID & this.name == o.name & this.price == o.price;
    }

    public int maxID(int value) {
        currentID = value;
        return currentID;
    }

    public String toString() {
        int var10000 = this.ID;
        return "GenereticItem{ID=" + var10000 + ", name='" + this.name + "', price=" + this.price + ", category1=" + String.valueOf(this.category1) + "}";
    }
}

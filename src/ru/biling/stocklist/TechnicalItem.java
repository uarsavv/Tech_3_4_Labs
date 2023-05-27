package ru.biling.stocklist;

public class TechnicalItem extends GenereticItem {
    public short warrantyTime;

    public TechnicalItem() {
    }

    public boolean equals(TechnicalItem o) {
        return this.warrantyTime == o.warrantyTime;
    }

    public void work1() {
        System.out.printf("WarrantyTime: %d", this.warrantyTime);
    }

    public String toString() {
        return "TechnicalItem{warrantyTime=" + this.warrantyTime + "}";
    }
}
package ru.biling.stocklist;

public class U0901WorkArray<T extends Number> {
    T[] arrNums;

    public U0901WorkArray(T[] numP) {
        this.arrNums = numP;
    }

    public double sum(){
        double doubleWork = 0d;
        for (T i:
                arrNums) {
            doubleWork+= i.doubleValue();
        }
        return doubleWork;
    }
}

package ru.biling.client;

import java.time.LocalDate;
import java.util.Date;
import ru.biling.stocklist.FoodItem;
import ru.biling.stocklist.ItemCatalog;
import ru.biling.stocklist.*;
import ru.biling.stocklist.U0901WorkArray;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object[] mas = new Object[3];
        GenereticItem Abc = new GenereticItem();
        Abc.ID = 311561;
        Abc.name = "Iwa";
        Abc.price = 3699;

        Abc.printAll();

        FoodItem Food = new FoodItem(Abc.name);
        Food.dateOfIncome = LocalDate.of(2018, 05, 05);
        Food.expires = 17;
        mas[0] = Food.expires;
        mas[1] = Food.dateOfIncome;

        FoodItem Food1 = new FoodItem(Abc.name);
        Food1.dateOfIncome = LocalDate.of(2020, 06, 05);
        Food1.expires = 20;

        FoodItem FoodClone = new FoodItem(Food.name);
        FoodClone = (FoodItem) Food1.clone();

        TechnicalItem Tech = new TechnicalItem();
        Tech.warrantyTime = 10;
        mas[2] = Tech.warrantyTime;

        for (int i = 0; i < 3; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.print("\nCheck equals:\n");
        System.out.print(Food1.equals(Food));

        System.out.print("\nCheck equalsOfClone:\n");
        System.out.print(Food1.equals(FoodClone));

        System.out.print("\nClone:\n");
        FoodClone.work();

        System.out.print("\nThe third task:\n");
        Integer intArr[] = {10, 20, 15};
        Float floatArr[] = new Float[10];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = (float) Math.random() * 10;
        }

        U0901WorkArray insWorkArrayInt = new U0901WorkArray<>(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray<>(floatArr);

        System.out.println("Integer array sum is = " + insWorkArrayInt.sum());
        System.out.println("Float array sum is = " + insWorkArrayFloat.sum());

        String line = "Конфеты 'Маска';45;120";
        String item_fld[] = line.split(";");
        FoodItem candy = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        candy.printAll();

        System.out.print("\nThe tourth task:\n");

        ItemCatalog cat = new ItemCatalog();
        for (int i = 0; i < 10; i++) {
            cat.addItem(new GenereticItem());
        }
        long begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            cat.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new
                Date().getTime();
        for (int i = 0; i < 100000; i++)
            cat.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));
        CatalogLoader loader=new CatalogStubLoader();
        loader.load(cat);
        cat.printItems();
        }

}

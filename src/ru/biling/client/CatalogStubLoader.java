package ru.biling.client;

import ru.biling.stocklist.ItemCatalog;
import ru.biling.stocklist.GenereticItem;
import ru.biling.stocklist.FoodItem;
import ru.biling.stocklist.Category;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader{
    @Override
    public void load(ItemCatalog cat) {
        GenereticItem item1 = new GenereticItem("Sony TV",23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
        cat.addItem(item1);
        cat.addItem(item2);
    }
}

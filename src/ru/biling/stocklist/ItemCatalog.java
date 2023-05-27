package ru.biling.stocklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ItemCatalog {
    private HashMap<Integer, GenereticItem> catalog = new HashMap();
    private ArrayList<GenereticItem> AlCatalog = new ArrayList();

    public ItemCatalog() {
    }

    public void addItem(GenereticItem item) {
        this.catalog.put(item.ID, item);
        this.AlCatalog.add(item);
    }

    public void printItems() {
        Iterator var1 = this.AlCatalog.iterator();

        while(var1.hasNext()) {
            GenereticItem i = (GenereticItem)var1.next();
            System.out.println(i);
        }

    }

    public GenereticItem findItemByID(int id) {
        return !this.catalog.containsKey(id) ? null : (GenereticItem)this.catalog.get(id);
    }

    public GenereticItem findItemByIDAL(int id) {
        Iterator var2 = this.AlCatalog.iterator();

        GenereticItem i;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            i = (GenereticItem)var2.next();
        } while(i.ID != id);

        return i;
    }
}
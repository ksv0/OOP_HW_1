package org.example;


import java.util.ArrayList;

/**
 * Кардаполов СВ
 * Разработчик | Программист | будни вечер | 4720 | 13.06.23
 */
public class Main {
    public static void main(String[] args) {
        Catalog cat = new Catalog();
        ArrayList<User> users = new ArrayList<>();


        Category tablets = new Category("Планшеты");
        Category mineralWater = new Category("Минералка");
        Category vapeLiquids = new Category("Жижа");

        Goods cheapTablet = new Goods("Telefunken zs730", 2000.53, 1.01);
        Goods middleTablet = new Goods("Matepad 11", 46000.00, 4.5);
        Goods overpricedTablet = new Goods("Surface pro 7", 109990.00, 4.1);

        tablets.addToStorage(cheapTablet, 2000000);
        tablets.addToStorage(middleTablet, 1305);
        tablets.addToStorage(overpricedTablet, 2);

        Goods water = new Goods("Волжанка", 36.0, 5.0);
        Goods anotherWater = new Goods("BonAqua", 138.3, 4.5);
        Goods anotherAnotherWater = new Goods("Борская", 92.2, 3.7);

        mineralWater.addToStorage(water, 256);
        mineralWater.addToStorage(anotherWater, 200);
        mineralWater.addToStorage(anotherAnotherWater, 130);

        Goods cheapLiquid = new Goods("Layka", 200.12, 0.01);
        Goods niceLiquid = new Goods("Husky", 460.00, 4.5);
        Goods anotherCheapLiquid = new Goods("GangIce", 309.00, 0.1);

        vapeLiquids.addToStorage(cheapLiquid, 200);
        vapeLiquids.addToStorage(niceLiquid, 1);
        vapeLiquids.addToStorage(anotherCheapLiquid, 30);

        cat.addCategory(tablets);
        cat.addCategory(mineralWater);
        cat.addCategory(vapeLiquids);


        User vadim = new User("pussypunisher2012", "qwerty");
        User jesus = new User("water", "wine");

        users.add(vadim);
        users.add(jesus);

        vadim.buy(tablets, cheapTablet, 1000);
        vadim.buy(vapeLiquids, cheapLiquid, 201);
        vadim.buy(vapeLiquids, cheapLiquid, 200);

        jesus.buy(mineralWater, water, 256);
        jesus.buy(mineralWater, anotherWater, 200);
        jesus.buy(mineralWater, anotherAnotherWater, 100);

        for (User u : users) {
            System.out.println(u);
        }


        System.out.println(cat);
    }


}
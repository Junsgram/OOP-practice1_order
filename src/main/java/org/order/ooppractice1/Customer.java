package org.order.ooppractice1;

import org.order.ooppractice1.cook.Cooking;
import org.order.ooppractice1.menu.Menu;
import org.order.ooppractice1.menu.MenuItem;

public class Customer {
    public void order(String menuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(menuName);
        Cook cook =  cooking.makeCook(menuItem);
    }
}

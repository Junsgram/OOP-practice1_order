package org.order.ooppractice1.cook;

import org.order.ooppractice1.Cook;
import org.order.ooppractice1.menu.MenuItem;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);
        return cook;
    }
}

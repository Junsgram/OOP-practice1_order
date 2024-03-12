package org.order.ooppractice1;

import org.order.ooppractice1.menu.MenuItem;

import java.util.Objects;

public class Cook {
    private final String name;
    private final int price
            ;

    public Cook(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Cook(MenuItem menuItem){
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    // class끼리 비교할 때는 equals hashcode메소드가 필요하다
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cook cook = (Cook) o;
        return price == cook.price && Objects.equals(name, cook.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

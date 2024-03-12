package org.order.ooppractice1.cook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.order.ooppractice1.Cook;
import org.order.ooppractice1.menu.MenuItem;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {
    @DisplayName("메뉴에 해당하는 음식을 만든다")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈가스",5000);
        Cook cook = cooking.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("돈가스", 5000));
    }
}

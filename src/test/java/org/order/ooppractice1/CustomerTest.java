package org.order.ooppractice1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.order.ooppractice1.cook.Cooking;
import org.order.ooppractice1.menu.Menu;
import org.order.ooppractice1.menu.MenuItem;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;


/**
 * 음식점에서 음식 주문하는 과정 구현
 * 요구사항
 * 1. 도메안을 구성하는 객체에는 어떤것들이 있는 지 고민
 *      ㄴ 손님, 메뉴판, 돈까스/냉면,만두(메뉴) , 요리사, 요리
 * 2. 객체들 간의 관계를 고민
 *      ㄴ 손님 - 메뉴판 - 요리주문
 *      ㄴ 요리사 - 손님에게 전달받은 요리를 요리
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 *      ㄴ 손님 ---> 손님 타입으로 추상화
 *      ㄴ 메뉴이름 ---> 요라티입으로 추상화
 *      ㄴ 메뉴판 ---> 메뉴판 타입으로 추상화
 *      ㄴ 메뉴 -- 메뉴 타입으로 추상화
 * 4. 협력을 설계
 *      ㄴ 테스트 코드를 통하여 관계 설계
 * 5. 객체들을 포괄하는 타입에 저겆ㄹ한 책임을 할당
 * 6, 구현하기
 */
public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 요리를 주문한다")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        // 메뉴의 이름과 요리사를 통해 음식을 주문
        Menu menu = new Menu(List.of(new MenuItem("돈가스", 5000), new MenuItem("냉면", 7000)));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("돈가스", menu, cooking))
                .doesNotThrowAnyException();

    }
}

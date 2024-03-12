package org.order.ooppractice1.cook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.order.ooppractice1.Cook;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatCode;

@SpringBootTest
public class CookTest {
    @DisplayName("요리를 생성한다")
    @Test
    void createTest() {
        assertThatCode(()-> new Cook("만두", 5000))
                .doesNotThrowAnyException();
    }
}

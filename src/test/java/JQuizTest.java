import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JQuizTest {
    @Test
    public void junitTest(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        // 문제 1
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        // 문제 2
        assertThat(name1).isEqualTo(name2);

        // 문제 3
        assertThat(name1).isNotEqualTo(name3);

    }

    @Test
    public void junitTest2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        // 문제 1
        assertThat(number1).isPositive();

        // 문제 2
        assertThat(number2).isZero();

        // 문제 3
        assertThat(number3).isNegative();

        // 문제 4
        assertThat(number1).isGreaterThan(number2);

        // 문제 5
        assertThat(number3).isLessThan(number2);

    }
}

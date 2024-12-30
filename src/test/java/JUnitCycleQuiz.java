import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

    @BeforeEach // 테스트 케이스를 시작하기 전마다 실행
    public void beforeEach() {
        System.out.println("Hello!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Bye!");
    }

    @Test
    public void junitQuiz3(){
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4(){
        System.out.println("This is second test");
    }
}

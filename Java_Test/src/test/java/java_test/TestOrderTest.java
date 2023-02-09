package java_test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)   //테스트 클래스당 해당 테스트 클래스의 인스턴스를 하나만 만들어 사용
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)   //테스트 순서 지정 (Order 사용)
class TestOrderTest {

    int value = 1;

    @Order(2)
    @Test
    @DisplayName("스터디 만들기 fast")
    @Tag("fast")
    void create_new_study(){
        Study actual = new Study(1);
        Assertions.assertThat(actual.getLimit()).isGreaterThan(0);  //isGreaterThan(0) : 0보다 큰 숫자인지 확인
        System.out.println(this);   //인스턴스 조회 (TestInstanceTest@eadcwe5)
        System.out.println("create_new_study :" + value++);  //1
    }

    @Order(1)
    @Test
    @DisplayName("스터디 만들기 slow")
    @Tag("slow")
    void createNew_study_again(){
        System.out.println(this);   //인스턴스 조회 (TestInstanceTest@eadcwe5)
        System.out.println("createNew_study_again :" + value++);  //2
    }

    @Order(4)
    @DisplayName("스터디 만들기 RepeatedTest")
    @RepeatedTest(value = 10, name = ".{displayName}, {currentRepetition}/{totalRepetitions}")
    void repeatTest(RepetitionInfo repetitionInfo){
        System.out.println("Test Case Info : " + repetitionInfo + " , 반복 횟수 : " + repetitionInfo.getTotalRepetitions());
    }

    @Order(3)
    @DisplayName("스터디 만들기 ParameterizedTest")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    @ValueSource(strings = {"날씨가", "많이", "추워지고", "있네요"})
    void ParameterizedTest(String message){
        System.out.println(message);
    }

    @BeforeAll
    void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after each");
    }


}
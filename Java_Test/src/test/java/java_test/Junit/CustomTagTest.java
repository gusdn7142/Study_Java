package java_test.Junit;


import java_test.Study;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CustomTagTest {

    @FastTest
    @Test
    @DisplayName("스터디 만들기 fast")
    void create_new_study(){

        Study actual = new Study(10);
        Assertions.assertThat(actual.getLimit()).isGreaterThan(0);  //isGreaterThan(0) : 0보다 큰 숫자인지 확인
        System.out.println("create_new_study");
    }

    @SlowTest
    @Test
    @DisplayName("스터디 만들기 slow")
    void createNew_study_again(){
        System.out.println("createNew_study_again");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
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
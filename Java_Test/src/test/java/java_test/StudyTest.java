package java_test;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
//import org.assertj.core.api.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;



@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 \uD83D\uDE31")
    @EnabledOnOs({OS.MAC, OS.LINUX, OS.WINDOWS})
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_9, JRE.JAVA_10,JRE.JAVA_11} )
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches= "LOCAL")
    //@EnabledIfSystemProperty(named = "java.version", matches = "11.0.15")
    void create_new_study(){

        String test_env = System.getenv("TEST_ENV");   //환경변수 TEST_ENV의 값 "LOCAL"을 조회

        System.out.println(test_env);
        Assumptions.assumeTrue("LOCAL".equalsIgnoreCase(test_env));   //test_env의 값이 "LOCAL"인지 확인


        Assumptions.assumingThat("LOCAL".equalsIgnoreCase(test_env),() ->{
            System.out.println("local");
            Study actual = new Study(100);
            //Assertions.assertThat(actual.getLimit()).isGreaterThan(0);
        });


        Assumptions.assumingThat("keesun".equalsIgnoreCase(test_env),() ->{
            System.out.println("keesun");
            Study actual = new Study(10);
            Assertions.assertThat(actual.getLimit()).isGreaterThan(0);

        });

        Study actual = new Study(10);
        Assertions.assertThat(actual.getLimit()).isGreaterThan(0);  //isGreaterThan(0) : 0보다 큰 숫자인지 확인

    }

    @Test
    //@Disabled
    void createNew_study_again(){
        System.out.println("create1");
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
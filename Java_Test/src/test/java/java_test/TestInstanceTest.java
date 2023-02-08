package java_test;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)   //테스트 클래스당 해당 테스트 클래스의 인스턴스를 하나만 만들어 사용
class TestInstanceTest {

    int value = 1;

    @Test
    @DisplayName("스터디 만들기 fast")
    @Tag("fast")
    void create_new_study(){
        Study actual = new Study(1);
        Assertions.assertThat(actual.getLimit()).isGreaterThan(0);  //isGreaterThan(0) : 0보다 큰 숫자인지 확인
        //System.out.println("create_new_study");
        System.out.println(this);   //인스턴스 조회 (TestInstanceTest@eadcwe5)
        System.out.println("create_new_study :" + value++);  //1
    }

    @Test
    @DisplayName("스터디 만들기 slow")
    @Tag("slow")
    void createNew_study_again(){
        //System.out.println("createNew_study_again");
        System.out.println(this);   //인스턴스 조회 (TestInstanceTest@eadcwe5)
        System.out.println("createNew_study_again :" + value++);  //2
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
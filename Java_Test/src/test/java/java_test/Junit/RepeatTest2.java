package java_test.Junit;


import java_test.domain.Study;
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
import org.junit.jupiter.params.provider.*;


class RepeatTest2 {

    @DisplayName("테스트 반복1")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    //@ValueSource(strings = {"날씨가", "많이", "추워지고", "있네요"})
    @ValueSource(ints = {10, 20, 40})
    //@NullAndEmptySource       //@NullSource + @EmptySource
    void ParameterizedTest(@ConvertWith(StudyConverter.class) Study study){      //string message
        //System.out.println(message);
//        System.out.println(study.getLimit());
    }


    @DisplayName("테스트 반복2")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    @CsvSource({"10, '자바 스터디'", "20, 스프링"})
    void ParameterizedTest2(@AggregateWith(StudyAggregator.class) Study study){                      //1. Integer limit, String name...   2. ArgumentsAccessor argumentsAccessor
        //Study study = new Study(argumentsAccessor.getInteger(0), argumentsAccessor.getString(1));   //limit, name
        System.out.println(study);
    }


    static class StudyConverter extends SimpleArgumentConverter{

        @Override
        protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
            Assertions.assertEquals(Study.class, targetType, "Can only convert to Study");
            return new Study(Integer.parseInt(source.toString()));
        }
    }

    static class StudyAggregator implements ArgumentsAggregator {
        @Override
        public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) throws ArgumentsAggregationException {
            return new Study(accessor.getInteger(0), accessor.getString(1));    //limit, name
        }
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
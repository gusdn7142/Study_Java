package java_test;


import org.junit.jupiter.api.*;

import java.time.Duration;




@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 \uD83D\uDE31")
    void create_new_study(){

        //Study 객체 생성
        //Study study = new Study(-10);

        //Study 객체 Null 검증
        //Assertions.assertNotNull(study);

        //Study 객체의 StudyStatus 값이 DRAFT인지 검증
        //Assertions.assertEquals(StudyStatus.DRAFT, study.getStatus(), new Supplier<String>() {
        //    @Override
        //    public String get() {
        //        return "스터디를 처음 만들면 상태값이 DRAFT여야 한다.";
        //    }
        //});
        //Assertions.assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면" + StudyStatus.DRAFT + " 상태다.");  //테스트가 성공하던 실패하던 무조건 문자열 연산을 한다.
        //Assertions.assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면" + StudyStatus.DRAFT + " 상태다.");   //테스트가 실패했을때만 messageSupplier 문자열 연산을 하기 때문에 람다식을 쓰면 성능상 유리


        //Study 객체의 limit 값이 0보다 큰지 검증
        //Assertions.assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 한다.");


        //모든 테스트에 대한 에러 메시지를 한번에 보는 방법
        //Assertions.assertAll(
        //        ()->Assertions.assertNotNull(study),
        //        ()->Assertions.assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + " 상태다."),
        //        ()->Assertions.assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 한다.")
        //);


        //발생한 예외를 검증
        //IllegalAccessException exception = Assertions.assertThrows(IllegalAccessException.class, () -> new Study(-10));
        //Assertions.assertEquals("limit은 0보다 커야 한다.", exception.getMessage());   //(실제 예외메시지, 기대하는 예외 메시지)


        //특정 시간 (100 millisecond) 안에 테스트가 수행되는지 확인 (안전한 방법)
        //Assertions.assertTimeout(Duration.ofMillis(100), () -> {
        //    new Study(10);
        //    Thread.sleep(300);   //1초 지연
        //});



        //특정 시간 (100 millisecond) 안에 테스트가 수행되는지 확인하고 + 특정 시간이 지나면 테스트를 강제로 종료시킴
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);   //1초 지연
        });
        // TODO ThreadLocal

        //System.out.println("create");
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
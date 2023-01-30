package java_test;


import org.junit.jupiter.api.*;


class StudyTest {

    @Test
    void create(){
        //Study 객체 생성
        Study study = new Study();

        //Study 객체 Null 검증
        Assertions.assertNotNull(study);
    }

    @Test
    //@Disabled
    void create1(){
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
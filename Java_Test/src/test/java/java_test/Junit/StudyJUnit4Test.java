package java_test.Junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * JUunit 5 플랫폼에 junit-vintage-engine 의존성을 추가하여 Junit 4 사용
 */
public class StudyJUnit4Test {


    @Before   //junit.Before 사용
    public void before(){
        System.out.println("before");
    }

    @After   //junit.After 사용
    public void After(){
        System.out.println("After");
    }


    @Test   //junit.Test 사용
    public void createTest1(){
        System.out.println("test1");
    }

    @Test  //junit.Test 사용
    public void createTest2(){
        System.out.println("test2");
    }

}

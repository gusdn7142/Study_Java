package java_test;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;


public class FindSlowTestExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private long THRESHOLD;  //ex, 1초

    public FindSlowTestExtension(long THRESHOLD) {
        this.THRESHOLD = THRESHOLD;
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {

        System.out.println("BeforeEachCallback 실행");
        ExtensionContext.Store store = getStore(context);                        //NamespaceAwareStore 객체 조회
        store.put("START TIME", System.currentTimeMillis());                    //테스트 마다 시작시간 측정 후 NamespaceAwareStore에 저장
    }


    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("AfterEachCallback 실행");
        Method requiredTestMethod = context.getRequiredTestMethod();             //테스트 메서드 조회
        SlowTest annotation = requiredTestMethod.getAnnotation(SlowTest.class);  //SlowTest 어노테이션 조회

        String testMethodName = context.getRequiredTestMethod().getName();      //테스트 메서드명 조회
        ExtensionContext.Store store = getStore(context);                        //NamespaceAwareStore 객체 조회

        Long start_time = store.remove("START TIME", long.class);   //NamespaceAwareStore 객체에서 "START TIME"을 없애면서 조회
        long duration = System.currentTimeMillis() - start_time;       //테스트 마다 종료시간 측정
        if(duration > THRESHOLD && annotation == null){                 //종료시간이 THRESHOLD 값보다 크고 SlowTest 어노테이션이 없으면
            System.out.printf("Please consider mark method [%s] with @SlowTest. \n", testMethodName);    //"@SlowTest" 어노테이션이 필요하다는 메시지 출력
        }
    }


    private static ExtensionContext.Store getStore(ExtensionContext context) {
        String testClassName = context.getRequiredTestClass().getName();      //테스트 클래스명 조회
        String testMethodName = context.getRequiredTestMethod().getName();     //테스트 메서드명 조회
        return context.getStore(ExtensionContext.Namespace.create(testClassName, testMethodName));   //NamespaceAwareStore 객체를 생성해 반환
    }


}

package ReflectionExam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderMain {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
         * Class Name에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고 그 정보를 clazz가 참조하여 동적 객체를 생성 후 메서드를 조회하여 실행
         */
        String className = "ReflectionExam.Bus";                //문자열로 클래스 명("Bus")을 선언
        Class clazz = Class.forName(className);                    //클래스 명을 통해 Class 객체 초기화
        Method[] declaredMethods = clazz.getDeclaredMethods();    //클래스 명을 통해 (private 포함) 모든 메소드 정보 조회
        //for(Method method : declaredMethods){                     //메서드를 하나씩 조회하여 메서드명 출력
        //    System.out.println(method.getName());                 //a,  b,  c
        //}

        Object object = clazz.newInstance();     //클래스명을 통해 동적으로 Bus 객체를 부모인 Object 타입으로 생성
        //Bus bus = (Bus) object;                 //Bus 객체의 부모인 Object 객체를 자식 타입(ex, Bus)으로 형변환
        //Car car = (Car) object;                  //Bus 객체의 부모인 Object객체를 Bus의 부모 타입(ex, Car)으로 형변환
        //bus.a();                               //Bus 클래스의 a() 메서드 호출
        //car.a();                               //Bus 클래스의 a() 메서드 호출

        //Method method = clazz.getDeclaredMethod("a", null);  //클래스명을 통해 파라미터가 없는 a()메서드 반환
        //method.invoke(object, null);                          //Bus 객체의 부모인 Object 객체가 참조하는 a() 메서드를 실행... 인수는 null
        for(Method method : declaredMethods){                     //메서드를 하나씩 조회
            method.invoke(object, method.getParameterTypes());    //Bus 객체의 부모인 Object 객체의 메서드를 하나씩 실행 (메서드 : method, 파라미터 : method.getParameterTypes() )
        }

    }
}









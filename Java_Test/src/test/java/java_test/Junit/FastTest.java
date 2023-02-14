package java_test.Junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)           //메서드에 사용 가능
@Retention(RetentionPolicy.RUNTIME)   //런타임까지 유지
@Tag("fast")                          //fast라는 태그에서 수행
@Test                                 //테스트에서 동작
public @interface FastTest {
}
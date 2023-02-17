package java_test.study;

import java_test.domain.Member;
import java_test.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)   //Mockito 확장모델 사용
class MockitoStubbingTest {

    //@Mock   //mock 객체 생성
    //MemberService memberService;

    //@Mock   //mock 객체 생성
    //StudyRepository studyRepository;



    //1. Mock 객체의 행동 테스트
    @Test
    void mockStubbing1(@Mock MemberService memberService, @Mock StudyRepository studyRepository ) {   ////Mock 객체인  MemberService, StudyRepository를 파라미터로 생성

        Optional<Member> findMember1 = memberService.findById(1L);  //Optional 리턴
        memberService.validate(1L);   //null 리턴

    }

    //2. 특정한 매개변수를 받은 경우 특정한 값을 리턴하거나 예뢰를 던지도록  Mock 객체의 행동 테스트
    @Test
    void mockStubbing2(@Mock MemberService memberService, @Mock StudyRepository studyRepository ) {   ////Mock 객체인  MemberService, StudyRepository를 파라미터로 생성

        //Member 객체 생성
        Member member = new Member();
        member.setId(1L);
        member.setEmail("Depth@email.com");

        //MemberService Mock 객체 Stubbing (정상 값 or 에러발생 상황)
        Mockito.when(memberService.findById(1L)).thenReturn(Optional.of(member));   //memberService.findById(1L)의 결과가 앞으로  member가 되게 만든다.
        //Mockito.when(memberService.findById(ArgumentMatchers.any())).thenReturn(Optional.of(member));   //memberService.findById(1L)의 결과가 앞으로  member가 되게 만든다.
        //Mockito.when(memberService.findById(1L)).thenThrow(new RuntimeException());   //memberService.findById(1L)의 값이면 예외를 발생시키게 만든다


        //Stubbing된 Mock 객체 테스트
        Optional<Member> findMember = memberService.findById(1L);  //Stubbing된 Mock 객체를 통해 Member 조회
        assertEquals("Depth@email.com", findMember.get().getEmail());  //findMember의 email을 조회하여 비교
        //assertThrows(RuntimeException.class, () -> {
        //    Optional<Member> findMember2 = memberService.findById(1L);
        //});

    }


    //3. 동일한 매개변수로 여러번 호출할떄 Mock 객체의 행동 테스트
    @Test
    void mockStubbing3(@Mock MemberService memberService, @Mock StudyRepository studyRepository ) {   ////Mock 객체인  MemberService, StudyRepository를 파라미터로 생성

        //Member 객체 생성
        Member member = new Member();
        member.setId(1L);
        member.setEmail("Depth@email.com");

        //MemberService Mock 객체 Stubbing (동일한 매개변수로 여러번 호출)
        Mockito.when(memberService.findById(1L))
                .thenReturn(Optional.of(member))    //member 리턴
                .thenThrow(new RuntimeException())  //RuntimeException 예외 발생
                .thenReturn(Optional.empty());  //Optional empty값 리턴

        //Stubbing된 Mock 객체 테스트
        Optional<Member> findMember1 = memberService.findById(1L);  //Stubbing된 Mock 객체를 통해 Member 조회
        assertEquals("Depth@email.com", findMember1.get().getEmail());  //findMember의 email을 조회하여 비교

        assertThrows(RuntimeException.class, () -> {
            Optional<Member> findMember2 = memberService.findById(1L);
        });

        Optional<Member> findMember3 = memberService.findById(1L);
        assertEquals(Optional.empty(), findMember3);
    }




}
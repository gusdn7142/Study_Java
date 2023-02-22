package java_test.study;

import java_test.domain.Member;
import java_test.domain.Study;
import java_test.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)   //Mockito 확장모델 사용
public class BDDStyleTest {

    @Mock   //mock 객체 생성
    MemberService memberService;

    @Mock   //mock 객체 생성
    StudyRepository studyRepository;

    @DisplayName("BDDMockito Test")
    @Test
    void createStudyService1(){

        //Given
        StudyService studyService = new StudyService(memberService, studyRepository);   //StudyService 객체 생성
        Member member = new Member();   //Member 객체 생성
        member.setId(1L);
        member.setEmail("Depth@email.com");

        Study study = new Study(10, "테스트");

        BDDMockito.given(memberService.findById(1L)).willReturn(Optional.of(member));   //Mockito.when을 BDD 스타일에 맞게 BDDMockito.given으로 변경
        BDDMockito.given(studyRepository.save(study)).willReturn(study);                        //Mockito.when을 BDD 스타일에 맞게 BDDMockito.given으로 변경

        //when
        Study findStudy = studyService.createNewStudy(1L, study);   //memberService의 findById(), notify() 메서드를 내부적으로 호출

        //then
        assertEquals(member, findStudy.getOwner());   //findStudy 객체의 member 객체와 member 객체 비교

        BDDMockito.then(memberService).should(Mockito.times(1)).notify(findStudy);      //Mockito.verify()를  BDDMockito.then().should()으로 변경
        BDDMockito.then(memberService).should(Mockito.times(1)).notify(member);         //Mockito.verify()를  BDDMockito.then().should()으로 변경
        BDDMockito.then(memberService).shouldHaveNoMoreInteractions();     //Mockito.verifyNoMoreInteractions()를  BDDMockito.then().shouldHaveNoInteractions()으로 변경
    }
}

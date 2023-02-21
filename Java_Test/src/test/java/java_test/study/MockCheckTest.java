package java_test.study;


import java_test.domain.Member;
import java_test.domain.Study;
import java_test.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)   //Mockito 확장모델 사용
public class MockCheckTest {

    @Mock   //mock 객체 생성
    MemberService memberService;

    @Mock   //mock 객체 생성
    StudyRepository studyRepository;

    @Test
    void createStudyService1(){

        //StudyService 객체 생성
        StudyService studyService = new StudyService(memberService, studyRepository);

        //Member 객체 생성
        Member member = new Member();
        member.setId(1L);
        member.setEmail("Depth@email.com");

        Study study = new Study(10, "테스트");

        Mockito.when(memberService.findById(1L)).thenReturn(Optional.of(member));
        Mockito.when(studyRepository.save(study)).thenReturn(study);

        Study findStudy = studyService.createNewStudy(1L, study);   //memberService의 findById(), notify() 메서드를 내부적으로 호출

        assertEquals(member, findStudy.getOwner());   //findStudy 객체의 member 객체와 member 객체 비교

        //Mock 객체 호출 횟수 확인
        Mockito.verify(memberService, Mockito.times(1)).notify(findStudy);  //memberService에서 notify(findStudy)가 딱 1번 호출 되었는지 확인   ..ArgumentMatchers.any()는 에러 발생
        Mockito.verify(memberService, Mockito.times(1)).notify(member);  //memberService에서 notify(member)가 딱 1번 호출 되었는지 확인   ..ArgumentMatchers.any()는 에러 발생
        Mockito.verify(memberService, Mockito.never()).validate(ArgumentMatchers.any());  //memberService에서 validate(아무 인자)가 0번 호출 되었는지 확인

        //Mock 객체 호출 순서 확인
        InOrder inOrder = Mockito.inOrder(memberService);   //notify(findStudy) => notify(mmeber) 순서로 호출했는지 확인
        inOrder.verify(memberService).notify(findStudy);
        inOrder.verify(memberService).notify(member);

        //Mockito.verify() 이후에 추가로 다른 인터랙션이 있는지 체크
        Mockito.verifyNoMoreInteractions(memberService);   //studyService.createNewStudy() 메서드 호출시 notify()가 2번 호출되기 때문에 verify()로 Interaction을 2번으로 맞춰주어야 한다.

        //Mock 객체가 특정 시간 이내에 호출되었는지 확인
        Mockito.verify(memberService, Mockito.timeout(100).times(1)).notify(findStudy);

    }

}

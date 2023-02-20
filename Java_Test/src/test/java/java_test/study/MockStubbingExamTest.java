package java_test.study;


import java_test.domain.Member;
import java_test.domain.Study;
import java_test.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)   //Mockito 확장모델 사용
public class MockStubbingExamTest {

        @Test
        void mockStubbingExam(@Mock MemberService memberService, @Mock StudyRepository studyRepository ){   //MemberService와 StudyRepository Mock 객체 생성

            //given (준비)
            StudyService studyService = new StudyService(memberService, studyRepository);
            Member member = new Member();
            member.setId(1L);
            member.setEmail("DepthAllnight@Gmail.com");
            Study study = new Study(10, "테스트");

            //when (실행)
            Mockito.when(memberService.findById(1L)).thenReturn(Optional.of(member));   //mock stubbing
            Mockito.when(studyService.createNewStudy(1L, study)).thenReturn(study);   //mock stubbing 필요.. (studyService 내부에 MemberService와 StudyRepository 객체가 garbase 값이기 떄문)
            //Mockito.when(studyRepository.save(study)).thenReturn(study);                     //바로 위의 문장 대체 가능
            Study findStudy = studyService.createNewStudy(1L, study);                //study객체에 memberId가 1인 member를 담아서 StudyRepository에 저장 후 study 객체 조회

            //then (검증)
            assertNotNull(findStudy.getOwner());         //findStudy 객체의 member 객체가 null이 아닌지 확인
            assertEquals(member, findStudy.getOwner());  //findStudy 객체의 member 객체와 member 객체 비교
        }
}

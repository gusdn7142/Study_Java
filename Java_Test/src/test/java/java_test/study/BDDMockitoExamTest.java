package java_test.study;


import java_test.domain.Study;
import java_test.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)   //Mockito 확장모델 사용
public class BDDMockitoExamTest {

    @Mock   //mock 객체 생성
    MemberService memberService;

    @Mock   //mock 객체 생성
    StudyRepository studyRepository;

    @DisplayName("Open Study")
    @Test
    void openStudy() {
        //Given
        StudyService studyService = new StudyService(memberService, studyRepository);
        Study study = new Study(10, "더 자바, 테스트");
        assertNull(study.getOpenedDateTime());                           //study의 openedDataTime이 null인지 확인
        BDDMockito.given(studyRepository.save(study)).willReturn(study);  //studyRepository Mock 객체의 save 메소드를 호출 시 study를 리턴

        //When
        studyService.openStudy(study);

        //Then
        assertEquals(StudyStatus.OPENED, study.getStatus());   //study의 status가 OPENED로 변경됐는지 확인
        assertNotNull(study.getOpenedDateTime());               //study의 openedDataTime이 null이 아닌지 확인
        BDDMockito.then(memberService).should().notify(study);   //memberService의 notify(study) 메서드 호출여부 확인
    }
}

package java_test.study;

import java_test.domain.Study;
import java_test.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)   //Mockito 확장모델 사용
class StudyServiceTest {

    @Mock   //mock 객체 생성
    MemberService memberService;

    @Mock   //mock 객체 생성
    StudyRepository studyRepository;

    @Test
    void createStudyService1(){
        //Mock 객체인  MemberService, StudyRepository 생성
        //MemberService memberService = Mockito.mock(MemberService.class);
        //StudyRepository studyRepository = Mockito.mock(StudyRepository.class);

        //StudyService 객체 생성
        StudyService studyService = new StudyService(memberService, studyRepository);

        assertNotNull(studyService);   //studyService가 not null인지 확인
    }

    @Test
    void createStudyService2(@Mock MemberService memberService, @Mock StudyRepository studyRepository ) {   ////Mock 객체인  MemberService, StudyRepository를 파라미터로 생성
        //StudyService 객체 생성
        StudyService studyService = new StudyService(memberService, studyRepository);

        assertNotNull(studyService);   //studyService가 not null인지 확인
    }



}
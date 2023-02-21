package java_test.study;

import java_test.domain.Member;
import java_test.domain.Study;
import java_test.member.MemberService;

import java.util.Optional;

public class StudyService {

    private final MemberService memberService;
    private final StudyRepository repository;

    public StudyService(MemberService memberService, StudyRepository repository) {
        assert memberService != null;   //memberService는 null이 아니어야 함
        assert repository != null;   //repository는 null이 아니어야 함
        this.memberService = memberService;
        this.repository = repository;
    }

    public Study createNewStudy(Long memberId, Study study) {
        Optional<Member> member = memberService.findById(memberId);
        //if (member.isEmpty()) {
        //    throw new IllegalArgumentException("Member doesn't exist for id: '" + memberId + "'");
        //}
        study.setOwner(member.orElseThrow(()->new IllegalArgumentException("Member doesn't exist for id: '" + memberId + "'")));

        Study newstudy = repository.save(study);
        memberService.notify(newstudy);
        memberService.notify(member.get());

        return repository.save(study);
    }

}
package java_test.member;

import java_test.domain.Member;
import java_test.domain.Study;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId);
    void validate(Long member);

    void notify(Study newstudy);
    void notify(Member member);
}

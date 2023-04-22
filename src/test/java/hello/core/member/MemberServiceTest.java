package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    // 조상 타입의 참조변수로 자손 객체를 가리킨다.
    // MemberServiceImpl 클레스는 memberService 인터페이스를 구현했다
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {

        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);


    }


}

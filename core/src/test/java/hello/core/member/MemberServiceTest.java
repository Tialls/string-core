package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService = new MemberServiceimpl();

    @Test
    void join() {

        //given
        Member memberA = new Member(1L,"memberA", Grade.VIP);
        Member memberB = new Member(2L,"memberB", Grade.VIP);

        memberService.join(memberA);
        memberService.join(memberB);
        Member findMember = memberService.findMember(2L);
        //when
        Assertions.assertThat(memberB).isEqualTo(findMember);

        //then
    }

    @Test
    void findMember() {
    }
}
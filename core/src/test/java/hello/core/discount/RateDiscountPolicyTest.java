//package hello.core.discount;
//
//import hello.core.AppConfig;
//import hello.core.member.Grade;
//import hello.core.member.Member;
//import hello.core.member.MemberService;
//import hello.core.member.MemberServiceimpl;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class RateDiscountPolicyTest {
//
//    MemberService memberService ;
//    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
//
//    @BeforeEach
//    void setUp(){
//        AppConfig appConfig = new AppConfig();
//        memberService = appConfig.memberService();
//    }
//
//    @Test
//    void discount() {
//
//        Member memberA = new Member(1L,"membarA", Grade.VIP);
//        memberService.join(memberA);
//        Member memberB = new Member(2L,"membarB", Grade.BASIC);
//        memberService.join(memberB);
//
//        int discountA = discountPolicy.discount(memberA, 10000);
//        int discountB = discountPolicy.discount(memberB, 10000);
//
//        Assertions.assertThat(discountA).isEqualTo(1000);
//        Assertions.assertThat(discountB).isEqualTo(0);
//
//
//    }
//}
package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceimpl;

public class AppConfig {
    //생성자 주입
//    public MemberService memberService(){
//        return new MemberServiceimpl(new MemoryMemberRepository());
//    }
//
//    public OrderService orderService(){
//        return new OrderServiceimpl( new MemoryMemberRepository(), new FixDiscountPolicy() );
//    }
    private MemberRepository memberRepository(){
        return new MemoryMemberRepository(); //메모리 회원 저장소 사용
    }
    private DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();  //고정 할인 정책을 사용
    }
    // MemberService 생성자 주입
    private MemberService memberService(){
        return new MemberServiceimpl(memberRepository());
    }
    // OrderService 생성자 주입
    private OrderService orderService(){
        return new OrderServiceimpl(memberRepository(), discountPolicy());
    }
}

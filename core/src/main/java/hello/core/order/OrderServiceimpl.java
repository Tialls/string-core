package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceimpl implements OrderService{
    MemberRepository memberRepository = new MemoryMemberRepository();

    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        //회원 조회
        Member member = memberRepository.findById(memberId);
        //회원 정보가지고 등급 조회해서 할인 금액 반환
        int discountPrice = discountPolicy.discount(member, itemPrice);

        Order order = new Order(memberId, itemName, itemPrice, discountPrice);

        return order;
    }
}

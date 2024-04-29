package hello.core.order;

import hello.core.order.OrderService;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {
    MemberService memberService = new MemberServiceimpl();
    OrderService orderService = new OrderServiceimpl();
    @Test
    void createOrder() {

        Member member = new Member(1L,"membarA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(1L,"testItem",10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

/*    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();*/

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void  beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createorder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDisCountPrice()).isEqualTo(1000); //vip의 경우 1000원 할인 해주기로 했음
    }

}

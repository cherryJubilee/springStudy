package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 애플리케이션 전체를 설정 및 구성
@Configuration
public class AppConfig {
    // 역할과 구현 클래스가 한 눈에 보임
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());  //생성자 주입
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() { // 누군가 orderService을 조회하면 OrderServiceImpl을 반환하는데 그 안에는 MemoryMemberRepository와 FixDiscountPolicy 가 있다.
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();

    }
}

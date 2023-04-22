package hello.core.discount;

import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member memebr, int Price) {
        return 0;
    }
}

package hello.core.order;

public interface OrderService {
    //최종 oeder 결과를 반환
    Order createorder(Long memberId, String itemName, int itemPrice);

}

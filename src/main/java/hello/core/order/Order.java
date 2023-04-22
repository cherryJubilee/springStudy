package hello.core.order;

public class Order {
    // 주문서 받고 할인율까지 다 끝났을때 만들어지는 객체
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int disCountPrice; // 할인 금액

    public Order(Long memberId, String itemName, int itemPrice, int disCountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.disCountPrice = disCountPrice;
    }

    // 비즈니스 계산 로직 추가
    public int calculatePrice() {
        return itemPrice - disCountPrice;
    }



    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDisCountPrice() {
        return disCountPrice;
    }

    public void setDisCountPrice(int disCountPrice) {
        this.disCountPrice = disCountPrice;
    }

    // 객체의 정보를 출력하는 용도
    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", disCountPrice=" + disCountPrice +
                '}';
    }
}

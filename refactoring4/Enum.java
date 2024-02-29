package refactoring4;

public class Enum {

    public static final int ORDER_ACCEPT = 10;         // 주문접수
    public static final int ORDER_COMPLETE = 20;     // 주문완료
    public static final int ORDER_CANCEL = 30;        // 주문취소

    public static final int DELIVERY_ACCEPT = 10;         // 배달접수
    public static final int DELIVERY_COMPLETE = 20;     // 배달완료
    public static final int DELIVERY_CANCEL = 30;        // 배달취소

    public enum Order {Accept, Complete, Cancel}
    public enum Delivery {Accept, Complete, Cancel}

    public static void main(String[] args) {
        Order order1 = null;
        Order order2 = null;
        order1 = Order.Accept;
        order2 = Order.Accept;

        System.out.println("order1 == Order.Accept : " + (order1 == Order.Accept));
        System.out.println("order1 == order2 : " + (order1 == order2));
    }
}

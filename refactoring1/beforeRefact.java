public class beforeRefact {

    final static String ORD_STS_010 = "10";         // 주문접수
    final static String ORD_STS_020 = "20";         // 주문완료

    final static String DELIVERY_STS_010 = "10";    // 배달 전
    final static String DELIVERY_STS_020 = "20";    // 배달 증
    final static String DELIVERY_STS_030 = "30";    // 배달 완료



    public static void main(String[] args) throws Exception{

        String ordStsCd = args[0];      // 주문상태코드
        String delivStsCd = args[1];    // 배달상태코드

        // '주문완료' 상태가 아니거나, '주문접수'이면서 '배달중' 또는 '배달완료'가 아닌 경우 리뷰작성이 불가능합니다.
        if (!(ordStsCd.equals(ORD_STS_020)
                || (ordStsCd.equals(ORD_STS_010) && (delivStsCd.equals(DELIVERY_STS_020) || delivStsCd.equals(DELIVERY_STS_030)))
            )) {
            throw new Exception("리뷰 작성이 불가능합니다");
        }
    }
}

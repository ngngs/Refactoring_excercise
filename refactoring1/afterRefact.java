public class afterRefact {

    final static String ORD_STS_010 = "10";         // 주문접수
    final static String ORD_STS_020 = "20";         // 주문완료

    final static String DELIVERY_STS_010 = "10";    // 배달 전
    final static String DELIVERY_STS_020 = "20";    // 배달 증
    final static String DELIVERY_STS_030 = "30";    // 배달 완료



    public static void main(String[] args) throws Exception{

        String ordStsCd = args[0];
        String delivStsCd = args[1];
        
        // 1. 조건을 캡슐화하라
        // 2. 부정조건문을 지양하라
        isReviewAbleOrThrow(ordStsCd, delivStsCd);
    }

    // 3. 서술적인 이름을 사용하라
    static void isReviewAbleOrThrow(String ordStsCd, String delivStsCd) throws Exception{

        // '주문완료'
        if(ORD_STS_020.equals(ordStsCd)) return;

        // '주문접수' + '배달중'
        if(ORD_STS_010.equals(ordStsCd) && DELIVERY_STS_020.equals(delivStsCd)) return;

        // '주문접수' + '배달완료'
        if(ORD_STS_010.equals(ordStsCd) && DELIVERY_STS_030.equals(delivStsCd)) return;

        // 위에서 return 되지 않았다면 리뷰작성이 불가능한 상태
        throw new Exception("리뷰작성이 불가능합니다");

    }
}

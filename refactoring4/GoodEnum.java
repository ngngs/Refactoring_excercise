package refactoring4;

public class GoodEnum {

    public static void main(String[] args) {
        // Example 1: Calculate pay for a weekday
        int weekdayPay = PayrollDay.MONDAY.pay(9 * 60, 10); // Worked 9 hours, $10 per hour
        System.out.println("Weekday Pay: $" + weekdayPay);

        // Example 2: Calculate pay for a weekend
        int weekendPay = PayrollDay.SATURDAY.pay(6 * 60, 12); // Worked 6 hours, $12 per hour
        System.out.println("Weekend Pay: $" + weekendPay);
    }

    enum PayrollDay{
        MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY),
        THURSDAY(PayType.WEEKDAY), FRIDAY(PayType.WEEKDAY), SATURDAY(PayType.WEEKEND),
        SUNDAY(PayType.WEEKEND);


        private final PayType payType;

        PayrollDay(PayType payType){
            this.payType = payType;
        }

        int pay(int minutesWorked, int payRate){
            return payType.pay(minutesWorked, payRate);
        }

        // 전략 열거 타입
        enum PayType{
            WEEKDAY{
                int overtimePay(int minsWorked, int payRate){
                    return minsWorked <= MINS_PER_SHIFT ? 0
                            : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
                }
            },

            WEEKEND{
                int overtimePay(int minsWorked, int payRate){
                    return minsWorked * payRate / 2;
                }
            };

            private static final int MINS_PER_SHIFT = 8 * 60;

            abstract int overtimePay(int mins, int payRate);

            int pay(int minsWorked, int payRate){
                int basePay = minsWorked * payRate;
                return basePay * overtimePay(minsWorked, payRate);
            }
        }

    }
}

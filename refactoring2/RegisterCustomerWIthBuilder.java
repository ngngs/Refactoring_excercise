public class RegisterCustomerWithBuilder {
    public static void main(String[] args) {
        Customer customer1 = new CustomerWithBuilder()
                .name("빌더왕")
                .birthday("19951005")
                .phoneNumber("01011112222")
                .build();

        Customer customer2 = new CustomerWithBuilder()
                .name("오미자")
                .birthday("19920510")
                .phoneNumber("01033334444")
                .build();

        System.out.println(customer1);
        System.out.println(customer2);
    }
}

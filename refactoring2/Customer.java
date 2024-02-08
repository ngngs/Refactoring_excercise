public class Customer {

    String name;
    String birthday;
    String phoneNumber;

    public Customer(String name, String birthday, String phoneNumber){
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "고객정보 { " +
                "이름=" + name +
                ", 생년월일=" + birthday +
                ", 전화번호=" + phoneNumber +
                " }";
    }
}

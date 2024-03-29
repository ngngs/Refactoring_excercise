public class CustomerWithJavaBeans {

    String name;
    String birthday;
    String phoneNumber;

    // JavaBeans패턴
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
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

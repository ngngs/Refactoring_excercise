public class CustomerWithBuilder {
    String name;
    String birthday;
    String phoneNumber;

    public CustomerWithBuilder name(String name){
        this.name = name;
        return this;
    }

    public CustomerWithBuilder birthday(String birthday){
        this.birthday = birthday;
        return this;
    }

    public CustomerWithBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Customer build(){
        return new Customer(name, birthday, phoneNumber);
    }


}

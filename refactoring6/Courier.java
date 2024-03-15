package refactoring6;

public class Courier {
    Long courierID;
    Contact contact;

    public Courier(Long courierID, Contact contact) {
        this.courierID = courierID;
        this.contact = contact;
    }

    void deliveryComplete(Client client){
        // 고객에게 완료 메시지 전송
        contact.sendMessage(client);
    }
}

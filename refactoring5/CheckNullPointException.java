package refactoring5;

public class CheckNullPointException {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        String myAnimalName = myAnimal.getName();

        if(myAnimalName.length() == 3){
            System.out.println("세글자다!");
        } else {
            System.out.println("아니다!");
        };

        if(myAnimalName != null){
            // ... 로직 처리
        }
    }
}

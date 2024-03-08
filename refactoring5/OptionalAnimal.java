package refactoring5;

import java.util.Optional;

public class OptionalAnimal {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        String myAnimalName = Optional.ofNullable(myAnimal.getName())
                .orElseGet(()-> "NoName");

        if(myAnimalName.length() == 3){
            System.out.println("세글자다!");
        } else {
            System.out.println("아니다!");
        };
    }

}

package refactoring5;

import java.util.Optional;

public class OrElseOrElseGet {
    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        Animal yourAnimal = new Animal();

        String myAnimalName = Optional.ofNullable(myAnimal.getName()).orElse("내꺼");
        String yourAnimalName = Optional.ofNullable(myAnimal.getName()).orElseGet(()->"너꺼");

        System.out.println("내 애니멀은 : " + myAnimalName);
        System.out.println("너 애니멀은 : " + yourAnimalName);
        
        // 무조건 실행되는 orElse()
        Animal hisAnimal = new Animal();
        hisAnimal.setName("초코");

        String hisAnimalName = Optional.ofNullable(hisAnimal.getName()).orElse(checkPlay());

        System.out.println("그의 애니멀은 : " + hisAnimalName);
    }

    public static  String checkPlay(){
        System.out.println("NULL이 아니더라도 무조건 실행");
        return "바나나";
    }
}

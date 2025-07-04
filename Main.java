import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Rex"));
        dogList.add(new Dog("Max"));

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Tiger"));
        animalList.add(new Dog("Buddy"));

        List<Object> objectList = new ArrayList<>();

        Utils.printAnimalNames(dogList);
        Utils.printAnimalNames(animalList);

        Utils.addDogToList(animalList);
        Utils.addDogToList(objectList);

        System.out.println("After adding dogs:");
        Utils.printAnimalNames(animalList);
    }
}

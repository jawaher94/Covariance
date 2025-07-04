import java.util.List;

class Utils {
    public static void printAnimalNames(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void addDogToList(List<? super Dog> dogs) {
        dogs.add(new Dog("NewDog"));
    }
}

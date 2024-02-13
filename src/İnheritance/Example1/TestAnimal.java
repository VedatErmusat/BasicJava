package İnheritance.Example1;

import İnheritance.Example1.Animal;
import İnheritance.Example1.Bird;
import İnheritance.Example1.Cat;
import İnheritance.Example1.Duck;

public class TestAnimal {
    public static void speakTry(Animal animalObj){
        animalObj.speak();
    }

    public static void main(String[] args) {
        Animal animalObj = new Animal("Animal");

        Bird birdObj = new Bird("Limon");
        Cat catObj = new Cat("Badem");
        Duck duckObj = new Duck("Kereviz");

        animalObj.speak();
        birdObj.speak();
        catObj.speak();
        duckObj.speak();

        Animal animalObj2 = new Bird("Pablo");
        animalObj2.speak();

        speakTry(new Duck("Bulut"));
    }

}

package İnheritance.Example1;

import İnheritance.Example1.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" is meowing...");
    }
}

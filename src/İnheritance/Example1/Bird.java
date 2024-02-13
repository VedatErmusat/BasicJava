package İnheritance.Example1;

import İnheritance.Example1.Animal;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" is crawing...");
    }
}

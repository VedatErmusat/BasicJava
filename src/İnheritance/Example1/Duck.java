package İnheritance.Example1;

import İnheritance.Example1.Animal;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" is quacking...");
    }
}

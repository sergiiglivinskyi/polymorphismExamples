package polymorphism2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Cat cat = new Cat();
        animals.add(dog);
        animals.add(duck);
        animals.add(cat);

        for(Animal animal : animals){
            animal.voice();
        }

        //OR
        animals.get(0).voice();
        animals.get(1).voice();
        animals.get(2).voice();
    }
}

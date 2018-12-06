package polymorphism1;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal duck = new Duck();
        Animal cat = new Cat();

        dog.voice(dog);
        duck.voice(duck);
        cat.voice(cat);
    }
}

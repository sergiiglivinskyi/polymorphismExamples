package polymorphism2;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal duck = new Duck();
        Animal cat = new Cat();

        dog.voice();
        duck.voice();
        cat.voice();
    }
}

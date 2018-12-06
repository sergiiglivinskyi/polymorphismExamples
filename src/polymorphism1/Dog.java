package polymorphism1;

public class Dog extends Animal{

    @Override
    public void voice(Animal a){
        System.out.println("Bark Bark");
    }
}

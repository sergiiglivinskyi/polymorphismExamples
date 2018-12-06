package polymorphism1;

public class Animal {

    public void voice(Animal a){
        a.animalVoice();
    }

    private void animalVoice(){
        System.out.println("polymorphism1.Animal Voice");
    }

}

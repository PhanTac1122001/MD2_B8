package ThucHanh.ThucHanh1;

public class Cat extends Animal{

    public Cat(String animalName) {
        super(animalName);
    }
    @Override
    public String makeSound(){
        return "Meo Meo";
    }
}

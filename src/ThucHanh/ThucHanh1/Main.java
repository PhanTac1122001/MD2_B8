package ThucHanh.ThucHanh1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Pig");
        Dog dog1 = new Dog("Pug","While");
        Dog dog2 = new Dog("Hurky","Black");
        Cat cat=new Cat("Dora");
        System.out.println("Animal is " + animal.getAnimalName());
        animal.setAnimalName("Bird");
        System.out.println("Animal is " + animal.getAnimalName());
        dog1.setAnimalName("Corgi");
        System.out.println("Name :"+dog1.getAnimalName());
        System.out.println("Sound :"+dog1.makeSound());
        System.out.println("Color :"+dog1.getColor());
        System.out.println("Sound :"+dog2.makeSound());
        System.out.println("Name :"+cat.getAnimalName());
        System.out.println("Sound :"+cat.makeSound());
    }
}

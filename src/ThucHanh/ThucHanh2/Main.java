package ThucHanh.ThucHanh2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "black");
        Car car2 = new Car("Ford", "white");
        System.out.println("Car 1's brand is "+ car1.getBrand());
        System.out.println(car1);
        System.out.println(car2);
        Motorcycle motor1 = new Motorcycle("Honda", "white");
        Motorcycle motor2 = new Motorcycle("Vin", "blue");
        System.out.println(motor1);
        System.out.println(motor2);
    }
}

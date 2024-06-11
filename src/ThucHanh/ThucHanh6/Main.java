package ThucHanh.ThucHanh6;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student st1 = new Student(111, "Chinh");
        Student st2 = new Student(222, "Toan");
        Student st3 = new Student(333, "James");
        st1.display();
        st2.display();
        st3.display();
    }
}

package ThucHanh.ThucHanh6;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "DDBIT" ;
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    static void change() {
        college = "RIKKEI ACADEMY";
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

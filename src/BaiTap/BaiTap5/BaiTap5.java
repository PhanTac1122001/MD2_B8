package BaiTap.BaiTap5;

public class BaiTap5 {
    public static void main(String[] args) {
        double circleArea = StaticMethod.calCircleArea(6);
        double rectangleArea = StaticMethod.calRectangleArea(7, 4);
        double triangleArea = StaticMethod.calTriangleArea(2, 4, 6);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);

    }
}

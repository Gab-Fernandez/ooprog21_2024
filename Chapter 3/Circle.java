public class Circle {

    static double radius;
    static double diameter;
    static double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area =  Math.PI * radius * radius;
    }
   
    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
package ss1_accessmodifier.bai_1;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public AccessModifier() {

    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return area = 8 * 8;
    }
}

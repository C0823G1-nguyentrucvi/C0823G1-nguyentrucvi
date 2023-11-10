package ss5_inheritance.bai_1;

public class Cylinder extends Circle {
    public double height;


    public Cylinder(String color, double radius, double height) {
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ",area=" + getArea() +'\''+
                ",volume=" + getVolume() +
                '}';
    }

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder("black", 2.0, 5.0);
        System.out.println(cylinder);
    }

}

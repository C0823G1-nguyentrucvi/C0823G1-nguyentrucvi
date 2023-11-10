package ss4_static.bai_tap.bai_1;

import java.awt.geom.Area;

public class Circle  {
    private double radius;
    private String color;

    public static final double PI=3.14;



    public double getRadius() {
        return radius;
    }



    public String getColor() {
        return color;
    }


    public double getArea(){
        return PI*radius*radius;
    }

   public Circle(){
        this.radius=1.0;
        this.color="red";
   }public Circle(double radius){
        this.radius=radius;

    }
}

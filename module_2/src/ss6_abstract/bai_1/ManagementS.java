package ss6_abstract.bai_1;

import java.util.Arrays;

public class ManagementS extends Shape {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(1);
        arr[1] = new Rectangle(1, 2);
        arr[2] = new Square(1,"blue", false);
        double a = 1 + (Math.random() * 100);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Circle) {
                Circle circle = (Circle) arr[i];
                circle.setRadius(circle.getRadius()*(1+a/100));

            }
            if(arr[i] instanceof Rectangle) {
                Rectangle rectangle=(Rectangle) arr[i];
                rectangle.setWidth(rectangle.getWidth()*(1+a/100));
                rectangle.setLength(rectangle.getLength()*(1+a/100));
            }
            if(arr[i] instanceof Square){
                Square square=(Square) arr[i];
                square.setWidth(square.getWidth()*(1+a/100));
            }

        }
        System.out.println(a);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }

}

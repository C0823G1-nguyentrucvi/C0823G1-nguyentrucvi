package ss6_abstract.bai_2;

import java.util.Arrays;

public class Management {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(1, "pink", false);
        array[1] = new Rectangle(1, 3, "green", true);
        array[2] = new Square(1, "red", true);
        double b = 1 + (Math.random() * 100);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Square) {
                Square square = (Square) array[i];
                square.howToColor();
            }
            if (array[i] instanceof Circle) {
                Circle circle = (Circle) array[i];
                circle.setRadius(circle.getRadius() * (1 + b / 100));
            }
            if (array[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) array[i];
                rectangle.getArea();
            }

        } System.out.println(b);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}

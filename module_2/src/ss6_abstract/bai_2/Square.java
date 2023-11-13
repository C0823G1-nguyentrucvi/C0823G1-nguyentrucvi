package ss6_abstract.bai_2;

public class Square extends Rectangle implements Colorable {

    @Override
    public void howToColor() {

    }

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square{}" + super.getWidth();
    }

    public static void main(String[] args) {
       Square square = new Square(7,"black",true);
        System.out.println(square);
    }
}

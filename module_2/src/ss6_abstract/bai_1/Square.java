package ss6_abstract.bai_1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);

    }

    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square{}"
                + super.getLength();
    }

    public static void main(String[] args) {
        Square square=new Square(1);
        System.out.println(square);
    }
}

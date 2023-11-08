package ss3_oop.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt((this.b * this.b) - 4 * this.a * this.c))) / (2 * this.a);
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt((this.b * this.b) - 4 * this.a * this.c))) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a");
        double a = input.nextDouble();
        System.out.println("nhap b");
        double b = input.nextDouble();
        System.out.println("nhap c");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("có 2 nghiệm" + quadraticEquation.getRoot1() +"và"+ quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("có 1 nghiệm" + quadraticEquation.getRoot1());
        } else {
            System.out.println("không có nghiệm nào");
        }
    }

}

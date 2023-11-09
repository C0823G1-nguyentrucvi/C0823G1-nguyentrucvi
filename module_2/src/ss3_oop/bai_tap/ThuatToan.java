package ss3_oop.bai_tap;

public class ThuatToan {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                if (i == 0 && j == 5 || i == 0 && j == 6) {
                    System.out.print("1");
                } else if (i == 1 && j == 4 || i == 1 && j == 7) {
                    System.out.print("2");
                } else if (i == 2 && j == 3 || i == 2 && j == 8) {
                    System.out.print("3");
                } else if (i == 3 && j == 2 || i == 3 && j == 9) {
                    System.out.print("4");
                } else if (i == 4 && j == 1 || i == 4 && j == 10) {
                    System.out.print("5");
                } else {
                    System.out.print(" ");
                }


            }
        }
        for (int i = 5; i <10; i++) {
            System.out.println();
            for (int k = 10; k > 0; k--) {
                if (i == 5 && k == 2 || i == 5 && k == 9) {
                    System.out.print("4");
                } else if (i == 6 && k == 3 || i == 6 && k == 8) {
                    System.out.print("3");
                } else if (i == 7 && k == 4 || i == 7 && k == 7) {
                    System.out.print("2");
                } else if (i == 8 && k == 5 || i == 8 && k == 6) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }

        }
    }
}

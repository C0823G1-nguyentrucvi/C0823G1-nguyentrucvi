package Lam_lai.view;

import Lam_lai.Controller.MilkController;
import Lam_lai.model.Milk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewMilk {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MilkController milkController = new MilkController();

    public static void menu() {
        int choice;
        while (true) {
            System.out.println("1.displayMilk" + "\n"
                    + "2.addMilk" + "\n" + "3.removeMilk");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Milk> milks = milkController.list();
                    displayMilk(milks);
                    break;
                case 2:
                    addMilk();
                    break;
            }
        }
    }

    private static void addMilk() {
        System.out.println("nhập name: ");
        String name = scanner.nextLine();
        System.out.println("nhâp code: ");
        String code = scanner.nextLine();
        System.out.println("nhap NSX: ");
        int NSX = Integer.parseInt(scanner.nextLine());
        Milk milk1 = new Milk(name, code, NSX);
        milkController.findAdd(milk1);
    }

    private static void displayMilk(List<Milk> milks) {
        for (Milk milk1 : milks) {
            System.out.println(milk1);
        }


    }
}

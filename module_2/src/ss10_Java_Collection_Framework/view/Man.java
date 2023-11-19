package ss10_Java_Collection_Framework.view;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;
import java.util.Scanner;

public class Man {
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println(" chào mừng bạn đến với thế giới sữa nhà Vi nha: ");
    ProductView productView=new ProductView();
    int choice;
    do{
        System.out.println("1.quản lý sản phẩm :");
        System.out.println("0.thoát");
        choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                productView.menuProduct();
                break;
            case 0:
                System.exit(0);
        }
    }while (true);
}

}

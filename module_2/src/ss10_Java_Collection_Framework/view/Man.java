package ss10_Java_Collection_Framework.view;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;
import java.util.Scanner;

public class Man {
    private static final Scanner scanner = new Scanner(System.in);
    private final ProductController productController = new ProductController();

    public void menuProduct() {
        int choice;
            do {
                System.out.println("---MENU---");
                System.out.println("1.Thêm sản phẩm: ");
                System.out.println("2.Sửa sản phẩm.");
                System.out.println("3.xóa sản phẩm");
                System.out.println("4.hiển thị sản phẩm");
                System.out.println("0.Trả về menu: ");

                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        Product product = inputInfoProduct();
                        productController.addProduct(product);
                        System.out.println("thêm mới thành công");
                        break;
                    case 3:
                        List<Product> products=productController.getAll();
                        for (Product temp: products) {
                            System.out.println(temp);
                        }
                        break;

                }
            } while (choice !=0);
        }
        private static Product inputInfoProduct() {
            System.out.println("nhập mã sản phẩm: ");
            String id=scanner.nextLine();
            System.out.println("nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("nhập giá sản phẩm: ");
            int salary= (int) Long.parseLong(scanner.nextLine());
            return new Product(id , name, salary);
        }

}

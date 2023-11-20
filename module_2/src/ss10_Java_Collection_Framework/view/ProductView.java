package ss10_Java_Collection_Framework.view;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
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
                    ProductController product = inputInfoProduct();
                     productController.addProduct(product);
                    System.out.println("thêm mới thành công");
                    break;
                case 4:
                    List<Product> products = productController.getAll();
                    if (products.isEmpty()) {
                        System.out.println("Khng có gì trong này!");
                    } else {
                        for (Product temp : products) {
                            System.out.println(temp);
                        }
                    }
                    break;
                case 3:
                    int id = scanner.nextInt();
                    Product productRemove = productController.findByCode(String.valueOf(id));
                    if (productRemove == null) {
                        System.out.println("không tìm thấy sản phẩm cần xóa");
                    } else {
                        System.out.println("thông tin sản phẩm cần xóa là : " + productRemove);
                        System.out.println("bạn có chắc muốn xóa người này không ? bấm y để xác nhận: ");
                        String confirm = scanner.nextLine();
                        if (confirm.equals("y")) {
                            productController.remove(String.valueOf(id));
                            System.out.println("Xóa thành công");
                        }


                    }
            }

        } while (choice != 0);
        {
            System.out.println("nhập mã sản phẩm: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("nhập giá sản phẩm: ");
            int salary = (int) Long.parseLong(scanner.nextLine());
            new Product(id, name, salary);
        }
    }

    private ProductController inputInfoProduct() {
        return productController;
    }


}

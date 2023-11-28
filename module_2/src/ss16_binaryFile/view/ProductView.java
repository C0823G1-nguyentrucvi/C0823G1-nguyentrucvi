package ss16_binaryFile.view;


import ss16_binaryFile.controller.ProductControllers;
import ss16_binaryFile.models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);
    private final ProductControllers productControllers = new ProductControllers();

    public void menuProduct() {

        int choice;

        do {
            System.out.println("1.thêm sản phẩm");
            System.out.println("2.hiển thị sản phẩm");
            System.out.println("3.tìm kiếm sản phẩm");
            System.out.println("0.thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Product product = InputProduct();
                    productControllers.addProduct(product);
                    System.out.println("thành công");
                    break;
                case 2:
                    List<Product> products = productControllers.getAll();
                    System.out.println(products);
                    break;
                case 3:
                    searchProductsByName();
                    break;
                case 0:
                    System.exit(0);
                    break;


            }

        } while (true);
    }

    private void searchProductsByName() {
        System.out.print("Nhap ten san pham can tim: ");
        String name = scanner.nextLine();
        List<Product> productList = productControllers.findProductsByName(name);
        if (productList.isEmpty()) {
            System.out.println("Khong tim thay san pham co ten " + name);
        } else {
            for (Product product1 : productList) {
                System.out.println(product1);
            }
        }
    }

    private Product InputProduct() {
        System.out.println(" mã thông tin");
        String code = scanner.nextLine();
        System.out.println("tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("giá");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("hàng sản xuất");
        String manufacture = scanner.nextLine();
        System.out.println("mô tả");
        String describe = scanner.nextLine();
        Product product = new Product(code, name, price, manufacture, describe);
        return product;
    }
}

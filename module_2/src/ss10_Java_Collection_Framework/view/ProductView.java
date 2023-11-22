package ss10_Java_Collection_Framework.view;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);
    private final ProductController productController = new ProductController();

    public void menuProduct() {

        int choice;
        do {
            System.out.println("1.thêm sản phâm");
            System.out.println("2.sửa sản phẩm");
            System.out.println("3.hiển thị sản phẩm");
            System.out.println("4.xóa sản phẩm");
            System.out.println("0.thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Product product = InputProduct();
                    productController.addProduct(product);
                    System.out.println("thêm mới thành công");
                    break;
                case 2:
                    System.out.println("nhập id muốn sửa");
                    String id1 = scanner.nextLine();
                    if (productController.checkId(id1)) {
                        List<Product> products = productController.comfirmId(id1);
                        System.out.println(products);
                        System.out.println("1.sửa name \n "
                                + "2.sửa price \n"
                        );
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("nhập tên mới");
                                String name = scanner.nextLine();
                                productController.editName(id1, name);
                                System.out.println("sửa thành công");
                                break;
                            case 2:
                                System.out.println("nhập giá mới");
                               String price=scanner.nextLine();
                               productController.editPrice(id1, Double.valueOf(price));
                                System.out.println("sửa thành công");
                        }


                    }


                    break;
                case 3:
                    List<Product> products = productController.getAll();
                    System.out.println(products);
                    break;
                case 4:
                    System.out.println("nhập id bạn muốn xóa");
                    String id = scanner.nextLine();
                    Product remove = productController.findById(id);
                    if (remove == null) {
                        System.out.println("không tìm thấy ");

                    } else {
                        System.out.println(" thông tin sản phẩm cần xóa" + remove);
                        System.out.println("bạn có muốn xóa? y/n:");
                        String confirm = scanner.nextLine();
                        do {
                            switch (confirm) {
                                case "y":
                                    productController.remove(id);
                                    System.out.println("xóa thành công");
                                    break;
                                case "n":
                                    return;

                                default:
                                    System.out.println("nhập sai rồi nhập lại");
                                    confirm = scanner.nextLine();
                            }

                        } while (true);
                    }
                case 0:
                    System.exit(0);
            }
        } while (true);
    }


    private Product InputProduct() {
        System.out.println("nhập id");
        String id = scanner.nextLine();
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập giá");
        Double price = Double.valueOf(scanner.nextLine());
        return new Product(id, name, price);
    }


}

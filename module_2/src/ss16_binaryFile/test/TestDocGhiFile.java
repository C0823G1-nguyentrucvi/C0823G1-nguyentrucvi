package ss16_binaryFile.test;

import ss16_binaryFile.models.Product;
import ss16_binaryFile.util.FileService;

import java.util.List;

public class TestDocGhiFile {
    private static final String DUONG_DAN = "src/ss16_binaryFile/doc/product.txt";
//String code, String name, Float price, String manufacture, String describe
    public static void main(String[] args) {
        List<Product> products = FileService.docDuLieuTuFile(DUONG_DAN);

//        products.add(new Product("TrucVi-123", "TrucVi", 1000f, "Hello", "Mo ta"));
//        products.add(new Product("TrucVi-456", "TrucVi1", 2000f, "Iphone", "Mo ta 2"));

//        FileService.ghiDuLieuVaoFile(DUONG_DAN, products);

//        products.add(new Product("q","w",2f,"o","p"));
//        FileService.ghiDuLieuVaoFile(DUONG_DAN,products);

        for (Product product:products) {
            System.out.println(product);
        }
    }
}

package ss16_binaryFile.repository;

import ss16_binaryFile.models.Product;
import ss16_binaryFile.util.FileService;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static final String PRODUCT_PATH_FILE = "src/ss16_binaryFile/doc/product.txt";

    @Override
    public List<Product> findAll() {
        //Doc tu file ra
        List<Product> products=FileService.docDuLieuTuFile(PRODUCT_PATH_FILE);

        return products;
    }

    @Override
    public List<Product> getAll() {
        List<Product> productList=FileService.docDuLieuTuFile(PRODUCT_PATH_FILE);
      return productList;
    }

    @Override
    public List<Product> findProductsByName(String name) {
//        List<Product> productList = FileService.docDuLieuTuFile(PRODUCT_PATH_FILE);
        List<Product> productList = new ArrayList<>();
        for (Product product: productList) {
            if (product.getName().contains(name)) {
                productList.add(product);
            }
        }
        return productList;
    }

    @Override
    public void addProduct(Product product) {
  List<Product> products=FileService.docDuLieuTuFile(PRODUCT_PATH_FILE);
  products.add(product);
  FileService.ghiDuLieuVaoFile(PRODUCT_PATH_FILE,products);
    }
}

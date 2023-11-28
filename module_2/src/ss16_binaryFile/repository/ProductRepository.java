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
        List<Product> products = FileService.readFile(PRODUCT_PATH_FILE);

        return products;
    }

    @Override
    public List<Product> getAll() {
        List<Product> productList = FileService.readFile(PRODUCT_PATH_FILE);
        return productList;
    }

    @Override
    public List<Product> findProductsByName(String name) {
        List<Product> productList = FileService.readFile(PRODUCT_PATH_FILE);
        List<Product> productArray = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                productArray.add(product);
            }
        }
        return productArray;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> products = FileService.readFile(PRODUCT_PATH_FILE);
        products.add(product);
        FileService.writeFile(PRODUCT_PATH_FILE, products);
    }
}

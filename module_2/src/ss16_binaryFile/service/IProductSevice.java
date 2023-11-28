package ss16_binaryFile.service;

import ss16_binaryFile.models.Product;

import java.util.List;

public interface IProductSevice {
    void findAll();

    List<Product> getAll();

    List<Product> findProductsByName(String name);

    void addProduct(Product product);

}

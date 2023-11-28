package ss16_binaryFile.repository;

import ss16_binaryFile.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();


    List<Product> getAll();

    List<Product> findProductsByName(String name);

    void addProduct(Product product);

}

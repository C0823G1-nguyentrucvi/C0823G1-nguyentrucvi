package ss10_Java_Collection_Framework.repository;

import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    void save(Product product);

    Product findById(String id);

    void remove(String id);

    boolean checkId(String id);

    List<Product> comfirmId(String id1);

    void editName(String id1, String name);

    void editPrice(String id1, String price);

    void editPrice(String id1, Double price);
}

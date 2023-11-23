package ss10_Java_Collection_Framework.sevice;

import ss10_Java_Collection_Framework.controller.ProductController;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public interface IProductService {


    void save(Product product);

    List<Product> findAll();

    Product findById(String id);

    void remove(String id);

    boolean checkId(String id);

    List<Product> comfirmId(String id1);

    void editName(String id1, String name);

    void editPrice(String id1, Double price);

    // void editPrice(String id1, Double price);
}

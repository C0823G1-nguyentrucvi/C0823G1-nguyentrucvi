package ss10_Java_Collection_Framework.sevice;

import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public interface IProductService {


    void save(Product product);

    List<Product> findAll();

    Product findByCode(String code);

    void remove(String code);

}

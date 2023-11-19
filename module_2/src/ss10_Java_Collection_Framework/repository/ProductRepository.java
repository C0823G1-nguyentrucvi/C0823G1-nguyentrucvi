package ss10_Java_Collection_Framework.repository;

import ss10_Java_Collection_Framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findByCode(String code) {
        return null;
    }

    @Override
    public void remove(String code) {

    }



        }




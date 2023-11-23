package ss10_Java_Collection_Framework.repository;

import ss10_Java_Collection_Framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private List<Product> products = new ArrayList<>();

    {
        products.add(new Product("1", "TrucVi", 1000d));
        products.add(new Product("2", "TrucTham", 2000d));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void remove(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
                break;
            }
        }
    }

    @Override
    public boolean checkId(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public List<Product> comfirmId(String id1) {
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (product.getId().contains(id1)) ;
            productList.add(product);
        }
        return productList;
    }

    @Override
    public void editName(String id1, String name) {
        for (Product product : products) {
            if (product.getId().equals(id1)) {
                product.setName(name);
            }
        }
    }

    @Override
    public void editPrice(String id1, Double price) {
        for (Product product : products) {
            if (product.getId().equals(id1)) {
                product.setPrice(price);
            }
        }
    }
}




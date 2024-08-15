package de.ait.app.repository;

import de.ait.app.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductRepositoryImp implements ProductRepository {

    List<Product> db = List.of(
            new Product(1L,"Banana", new BigDecimal(0.90),"art1" ),
            new Product(1L,"Peach", new BigDecimal(1.90),"art2" ),
            new Product(1L,"Nuss", new BigDecimal(2.30),"art3" ),
            new Product(1L,"Milch", new BigDecimal(4.90),"art4" )
            );



    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product delete(Product product) {
        return null;
    }
}

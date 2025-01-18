package Repository;

import Model.Product;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements GenericRepository<Product> {

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public void save(Product entity) {

    }

    @Override
    public void update(Long id, Product entity) {

    }

    @Override
    public void delete(Long id) {

    }
}
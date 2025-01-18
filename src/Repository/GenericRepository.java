package Repository;

import java.util.Optional;
import java.util.List;

public interface GenericRepository<T>{
    Optional<T> findById(Long id);
    List<T> findAll();
    void save(T entity);
    void update(Long id, T entity);
    void delete(Long id);
}

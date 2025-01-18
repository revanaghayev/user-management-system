package Model;

import Repository.GenericRepository;

import java.util.List;
import java.util.Optional;

public class BaseEntity implements GenericRepository<BaseEntity> {
    private Long id;

    @Override
    public Optional<BaseEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<BaseEntity> findAll() {
        return List.of();
    }

    @Override
    public void save(BaseEntity entity) {

    }

    @Override
    public void update(Long id, BaseEntity entity) {

    }

    @Override
    public void delete(Long id) {

    }
}
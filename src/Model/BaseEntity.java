package Model;

import Repository.GenericRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BaseEntity implements GenericRepository<BaseEntity> {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Optional<BaseEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<BaseEntity> findAll() {
        return Collections.emptyList();
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
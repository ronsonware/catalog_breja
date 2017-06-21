package service;

import model.BrejaPojo;
import org.springframework.dao.EmptyResultDataAccessException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by robsonrodrigues on 21/06/17.
 */
public class BrejaService <T extends BrejaPojo<Long>, Long extends Serializable> {

    protected abstract JpaRepository<T, Long> getRepository();

    public List<T> listar() {
        return new ArrayList<>();
    }

    public T saveBreja(T entity) {
        return null;
    }

    public T getBreja(Long id) {
        return null;
    }

    public void deleteBreja(Long id) {
    }

    public void updateBreja(T entity) {

    }

}

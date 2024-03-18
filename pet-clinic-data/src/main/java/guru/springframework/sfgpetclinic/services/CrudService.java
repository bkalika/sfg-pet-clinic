package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/19/2024
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

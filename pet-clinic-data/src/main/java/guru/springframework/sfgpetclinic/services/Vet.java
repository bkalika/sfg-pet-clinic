package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/18/2024
 */
public interface Vet {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

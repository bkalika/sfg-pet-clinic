package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/31/2024
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}

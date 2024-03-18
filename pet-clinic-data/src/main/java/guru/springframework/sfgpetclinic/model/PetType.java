package guru.springframework.sfgpetclinic.model;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/14/2024
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

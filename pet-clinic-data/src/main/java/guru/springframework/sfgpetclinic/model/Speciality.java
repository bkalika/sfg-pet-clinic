package guru.springframework.sfgpetclinic.model;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/26/2024
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

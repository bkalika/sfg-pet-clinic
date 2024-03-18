package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/19/2024
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

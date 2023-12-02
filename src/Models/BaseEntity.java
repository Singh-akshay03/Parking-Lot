package Models;

import java.util.UUID;

public  abstract class BaseEntity {
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }



}

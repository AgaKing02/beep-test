package kz.beeline.beeplay.beeplay.entity.dto;

import java.io.Serializable;

public class EventTypeDTO implements Serializable {
    private Long id;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

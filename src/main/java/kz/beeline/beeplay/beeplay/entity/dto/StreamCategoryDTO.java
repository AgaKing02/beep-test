package kz.beeline.beeplay.beeplay.entity.dto;

import java.io.Serializable;

public class StreamCategoryDTO implements Serializable {
    private Long id;

    private String slug;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

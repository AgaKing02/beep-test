package kz.beeline.beeplay.beeplay.entity.dto;

import java.io.Serializable;

public class SocialDTO implements Serializable {
    private Long id;
    private String name;

    private String link;

    private String icon;


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

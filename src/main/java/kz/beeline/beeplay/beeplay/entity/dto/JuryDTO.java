package kz.beeline.beeplay.beeplay.entity.dto;

import java.io.Serializable;
import java.util.List;

public class JuryDTO implements Serializable {
    private Long id;

    private String name;

    private String photo;

    private List<SocialDTO> socials;

    public List<SocialDTO> getSocials() {
        return socials;
    }

    public void setSocials(List<SocialDTO> socials) {
        this.socials = socials;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}

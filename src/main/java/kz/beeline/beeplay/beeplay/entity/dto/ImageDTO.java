package kz.beeline.beeplay.beeplay.entity.dto;

import java.io.Serializable;

public class ImageDTO implements Serializable {
    private Long id;
    private String large;
    private String small;

    public ImageDTO(Long id, String large, String small) {
        this.id = id;
        this.large = large;
        this.small = small;
    }

    public ImageDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        if(large!=null)
        this.large = large;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        if(small!=null)
        this.small = small;
    }
}

package kz.beeline.beeplay.beeplay.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "IMAGE")
@Entity
@Data
public class Image {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "large")
    @Lob
    private String large;

    @Column(name = "small")
    @Lob
    private String small;

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
        this.large = large;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }
}
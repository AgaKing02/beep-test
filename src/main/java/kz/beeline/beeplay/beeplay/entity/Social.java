package kz.beeline.beeplay.beeplay.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "SOCIAL")
@Entity
public class Social {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "link")
    private String link;

    @Column(name = "icon")
    @Lob
    private String icon;

    @JoinColumn(name = "jury_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Jury jury;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Jury getJury() {
        return jury;
    }

    public void setJury(Jury jury) {
        this.jury = jury;
    }
}
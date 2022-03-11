package kz.beeline.beeplay.beeplay.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "EVENT_TYPE")
@Entity
public class EventType {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
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
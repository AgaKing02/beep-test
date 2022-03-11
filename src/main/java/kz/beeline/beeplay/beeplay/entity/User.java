package kz.beeline.beeplay.beeplay.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "usr")
public class User  {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

package kz.beeline.beeplay.beeplay.entity;

import javax.persistence.*;

@Table(name = "CONTEST_WORK", indexes = {
//        @Index(name = "IDX_CONTESTWORK_user_id", columnList = "user_id"),
        @Index(name = "IDX_CONTESTWORK_contest_id", columnList = "contest_id")
})
@Entity
public class ContestWork {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JoinColumn(name = "contest_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Contest contest_id;

//    @OneToOne(fetch = FetchType.EAGER)
//    private User user;

    @Lob
    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "likes")
    private Long likes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contest getContest_id() {
        return contest_id;
    }

    public void setContest_id(Contest contest_id) {
        this.contest_id = contest_id;
    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }
}
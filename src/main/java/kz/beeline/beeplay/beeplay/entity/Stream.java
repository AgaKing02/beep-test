package kz.beeline.beeplay.beeplay.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "STREAM", indexes = {
        @Index(name = "IDX_STREAM_CATEGORY_ID", columnList = "category")
})
@Entity
public class Stream {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stream_id", nullable = false)
    private String stream_id;

    @JoinColumn(name = "category", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private StreamCategory category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStream_id() {
        return stream_id;
    }

    public void setStream_id(String stream_id) {
        this.stream_id = stream_id;
    }

    public StreamCategory getCategory() {
        return category;
    }

    public void setCategory(StreamCategory category) {
        this.category = category;
    }
}
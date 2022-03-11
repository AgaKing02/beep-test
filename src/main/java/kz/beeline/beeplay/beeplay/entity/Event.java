package kz.beeline.beeplay.beeplay.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "EVENT", indexes = {
        @Index(name = "IDX_EVENT_event_type", columnList = "event_type"),
        @Index(name = "IDX_EVENT_image", columnList = "image")
})
@Entity
public class Event {
    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "title")
    private String title;

    @JoinColumn(name = "event_type", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private EventType event_type;

    @Column(name = "description")
    private String description;

    @Column(name = "event_form")
    private String event_form;

    @Column(name = "content")
    @Lob
    private String content;

    @Column(name = "annotation")
    @Lob
    private String annotation;

    @Column(name = "video")
    private String video;

    @JoinColumn(name = "image")
    @OneToOne(fetch = FetchType.LAZY)
    private Image image;

    @JoinTable(name = "event_link",
            joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "link_id", referencedColumnName = "id"))
    @ManyToMany
    private List<Link> links;

    @OneToMany(mappedBy = "event")
    private List<SliderSlide> slider;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EventType getEvent_type() {
        return event_type;
    }

    public void setEvent_type(EventType event_type) {
        this.event_type = event_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent_form() {
        return event_form;
    }

    public void setEvent_form(String event_form) {
        this.event_form = event_form;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<SliderSlide> getSlider() {
        return slider;
    }

    public void setSlider(List<SliderSlide> slider) {
        this.slider = slider;
    }
}
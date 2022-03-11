package kz.beeline.beeplay.beeplay.entity.dto;

import javax.persistence.Lob;
import java.io.Serializable;
import java.util.List;

public class EventDTO implements Serializable {

    private Long id;

    private String slug;

    private String title;

    private EventTypeDTO event_type;

    private String description;

    private String event_form;

    @Lob
    private String content;

    @Lob
    private String annotation;

    private String video;

    private ImageDTO image;

    private List<LinkDTO> links;

    private List<SliderSlideDTO> slider;

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

    public EventTypeDTO getEvent_type() {
        return event_type;
    }

    public void setEvent_type(EventTypeDTO event_type) {
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

    public ImageDTO getImage() {
        return image;
    }

    public void setImage(ImageDTO image) {
        this.image = image;
    }

    public List<LinkDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinkDTO> links) {
        this.links = links;
    }

    public List<SliderSlideDTO> getSlider() {
        return slider;
    }

    public void setSlider(List<SliderSlideDTO> slider) {
        this.slider = slider;
    }
}

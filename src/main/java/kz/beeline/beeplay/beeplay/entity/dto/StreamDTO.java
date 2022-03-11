package kz.beeline.beeplay.beeplay.entity.dto;

import java.io.Serializable;

public class StreamDTO implements Serializable {
    private Long id;

    private String stream_id;

    private StreamCategoryDTO category;


    public String getStream_id() {
        return stream_id;
    }

    public void setStream_id(String stream_id) {
        this.stream_id = stream_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StreamCategoryDTO getCategory() {
        return category;
    }

    public void setCategory(StreamCategoryDTO category) {
        this.category = category;
    }
}

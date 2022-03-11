package kz.beeline.beeplay.beeplay.entity.dto;

import javax.persistence.Lob;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ContestDTO implements Serializable {

    private Long id;

    private String slug;

    private String title;

    private String image;

    private LocalDate contest_start;

    private LocalDate contest_end;

    private LocalDate results;

    private String short_description;

    @Lob
    private String about;

    @Lob
    private String specification;

    private List<PartnerDTO> partners;

    private List<JuryDTO> jury;

    private Boolean is_active = false;

    public ContestDTO(){

    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<PartnerDTO> getPartners() {
        return partners;
    }

    public void setPartners(List<PartnerDTO> partners) {
        this.partners = partners;
    }

    public List<JuryDTO> getJury() {
        return jury;
    }

    public void setJury(List<JuryDTO> jury) {
        this.jury = jury;
    }

    public LocalDate getContest_start() {
        return contest_start;
    }

    public void setContest_start(LocalDate contest_start) {
        this.contest_start = contest_start;
    }

    public LocalDate getContest_end() {
        return contest_end;
    }

    public void setContest_end(LocalDate contest_end) {
        this.contest_end = contest_end;
    }

    public LocalDate getResults() {
        return results;
    }

    public void setResults(LocalDate results) {
        this.results = results;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }


    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }
}

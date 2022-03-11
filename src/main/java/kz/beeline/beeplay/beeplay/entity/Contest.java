package kz.beeline.beeplay.beeplay.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "CONTEST")
@Entity
public class Contest {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    @Lob
    private String image;

    @Column(name = "contest_start")
    private LocalDate contest_start;

    @Column(name = "contest_end")
    private LocalDate contest_end;

    @Column(name = "results")
    private LocalDate results;

    @Column(name = "short_description")
    private String short_description;

    @Column(name = "about")
    @Lob
    private String about;

    @Column(name = "specification")
    @Lob
    private String specification;

    @JoinTable(name = "contest_partner_Link",
            joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "partner_id", referencedColumnName = "ID"))
    @ManyToMany
    private List<Partner> partners;

    @JoinTable(name = "contest_jury_link",
            joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "jury_id", referencedColumnName = "id"))
    @ManyToMany
    private List<Jury> jury;

    @Column(name = "is_active", nullable = false)
    private Boolean is_active = false;

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

    public List<Partner> getPartners() {
        return partners;
    }

    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }

    public List<Jury> getJury() {
        return jury;
    }

    public void setJury(List<Jury> jury) {
        this.jury = jury;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }
}
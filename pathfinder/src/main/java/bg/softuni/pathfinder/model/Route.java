package bg.softuni.pathfinder.model;

import bg.softuni.pathfinder.model.enums.RouteLevel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    private RouteLevel level;

    private String name;

    @ManyToOne
    private User author;

    @Column(name = "video_url", columnDefinition = "TEXT")
    private String videoUrl;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "route")
    private Set<Comment> comments;

    public Route() {
        this.comments = new HashSet<>();
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public RouteLevel getLevel() {
        return level;
    }

    public void setLevel(RouteLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}

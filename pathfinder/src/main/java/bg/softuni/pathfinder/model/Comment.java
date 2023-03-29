package bg.softuni.pathfinder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

    private boolean approved;

    private LocalDateTime created;

    @Column(columnDefinition = "LONGTEXT")
    private String text;

    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

    public Comment() {
    }


}

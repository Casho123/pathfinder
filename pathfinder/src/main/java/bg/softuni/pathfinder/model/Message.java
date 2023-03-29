package bg.softuni.pathfinder.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message extends BaseEntity {

    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

    @Column(columnDefinition = "TEXT")
    private String text;

    @ManyToOne
    private User author;

    @ManyToOne
    private User recipient;

    public Message() {
    }




}

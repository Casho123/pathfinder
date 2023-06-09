package bg.softuni.pathfinder.model;

import bg.softuni.pathfinder.model.enums.RouteCategory;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {


    @Enumerated(EnumType.STRING)
    private RouteCategory name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Category() {
    }


    public RouteCategory getName() {
        return name;
    }

    public void setName(RouteCategory name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

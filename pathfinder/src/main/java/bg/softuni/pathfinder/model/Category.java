package bg.softuni.pathfinder.model;

import bg.softuni.pathfinder.model.enums.RouteCategory;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {


    @Column(nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private RouteCategory category;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RouteCategory getCategory() {
        return category;
    }

    public void setCategory(RouteCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package bg.softuni.pathfinder.view;

import bg.softuni.pathfinder.model.enums.UserLevel;


public class UserProfileView {

    private String username;

    private String fullName;

    private int age;

    private String email;

    private String level;

    public UserProfileView() {
    }

    public UserProfileView(String username, String fullName, int age, String email, String level) {
        this.username = username;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

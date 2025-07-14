package dev.mafaldalopes.talebase.persistence.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends AbstractModel {

    @Column(
            nullable = false,
            unique = true
    )
    private String username;

    @Column(
            nullable = false,
            name = "first_name"
    )
    private String firstName;

    @Column(
            nullable = false,
            name = "last_name"
    )
    private String lastName;

    @Column(nullable = false)
    private Integer age;

    @Column(
            nullable = false,
            unique = true
    )
    private String email;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "author"
    )
    private List<Story> ownStories;

    // Favorites
    @ManyToMany
    @JoinTable(
            name = "users_favorites",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "story_id"))
    private List<Story> favoriteStories;

    // Followers / Following
    @ManyToMany
    @JoinTable(
            name = "users_follows",
            joinColumns = @JoinColumn(name = "follower_id"),
            inverseJoinColumns = @JoinColumn(name = "followed_id"))
    private List<User> following;

    public static final User NO_USER = new User();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fullName) {
        this.firstName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Story> getOwnStories() {
        return ownStories;
    }

    public void setOwnStories(List<Story> stories) {
        this.ownStories = stories;
    }

    public List<Story> getFavoriteStories() {
        return favoriteStories;
    }

    public void setFavoriteStories(List<Story> favoriteStories) {
        this.favoriteStories = favoriteStories;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }
}

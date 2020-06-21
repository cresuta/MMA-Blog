package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Set<Post> posts;

    protected Category(){}

    public Category(String name, Set<Post> posts) {
        this.name = name;
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Post> getPosts() {
        return posts;
    }
}
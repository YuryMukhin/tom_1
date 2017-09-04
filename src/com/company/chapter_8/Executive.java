package com.company.chapter_8;

/**
 * Created by ymukhin on 9/4/2017.
 */
public class Executive extends Manager {
    private String post;

    public Executive() {
        super();
    }

    public Executive(String name, int salary, String post) {
        super(name, salary);
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}

package com.jonmid.asynctaskinternet.Models;

/**
 * Created by software on 21/09/2017.
 */

public class Comment {
    private int id;
    private String email;
    private String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

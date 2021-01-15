package com.example.demo.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class user {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<user_demo> user_demos = new ArrayList<>();

    public user() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

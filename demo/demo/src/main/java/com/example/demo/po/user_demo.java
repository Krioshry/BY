package com.example.demo.po;

import javax.persistence.*;

@Entity
@Table(name="t_demo")
public class user_demo {
    @Id
    @GeneratedValue
    private long id;
    private String card;

    @ManyToOne()
    private user user;
    public user_demo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "user_demo{" +
                "id=" + id +
                ", card='" + card + '\'' +
                '}';
    }
}

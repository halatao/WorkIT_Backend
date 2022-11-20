package com.portal.WorkIT.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private long id;

    @Column(name = "name",nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = "user")
    private List<User> users;

    public Role(String name) {
        this.id = id;
        this.name = name;
    }

    public Role(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

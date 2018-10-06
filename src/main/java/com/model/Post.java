package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Posts")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_p")
    private int id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "posts", cascade = CascadeType.PERSIST)
    private Set<Tag> tags;
}

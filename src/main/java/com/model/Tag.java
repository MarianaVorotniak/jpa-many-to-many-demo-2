package com.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Tags")
@Data
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_t")
    private int id;

    private String name;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "post_tag",
            joinColumns = @JoinColumn(name = "id_t"),
            inverseJoinColumns = @JoinColumn(name = "id_p"))
    private Set<Post> posts;

}

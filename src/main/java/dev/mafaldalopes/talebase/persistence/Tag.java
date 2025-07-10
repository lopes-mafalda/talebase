package dev.mafaldalopes.talebase.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tags")
public class Tag extends AbstractModel{


    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Story> stories;
}

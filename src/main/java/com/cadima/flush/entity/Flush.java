package com.cadima.flush.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Flush implements Serializable {

    private static final long serialVersionUID = -8649430117017729519L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    public Flush() {
    }

    public Flush(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flush{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

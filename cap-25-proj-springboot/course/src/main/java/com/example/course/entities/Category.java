package com.example.course.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_category")
@EqualsAndHashCode
@NoArgsConstructor
public class Category implements Serializable {

    @Getter
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }



}

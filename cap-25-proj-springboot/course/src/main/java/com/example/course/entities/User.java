package com.example.course.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String password;

    public User(){}



}

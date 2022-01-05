package com.h2Database.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "person")
@Entity
@NoArgsConstructor
public class Person implements Serializable {

    private static final long serialVersionUID = 2227547004886222146L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Person(String name) {
        this.name = name;
    }


}

package com.company.hibernate.basic;


import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@Table(name = "PersonTable")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_seq_gen")
    @SequenceGenerator(name = "person_id_seq_gen", sequenceName = "per_id_seq_gen", allocationSize = 1)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

}

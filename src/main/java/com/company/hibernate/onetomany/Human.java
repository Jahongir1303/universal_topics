package com.company.hibernate.onetomany;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "humanTable")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "human_id_seq_gen")
    @SequenceGenerator(name = "human_id_seq_gen", sequenceName = "hum_id_seq_gen", allocationSize = 1)
    private int id;

    private String name;

    private int age;

    @OneToMany(mappedBy = "owner",cascade = CascadeType.ALL)
    private List<Item> items;

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", items=" + items +
                '}';
    }
}

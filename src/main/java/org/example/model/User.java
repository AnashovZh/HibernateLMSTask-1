package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {
    @Id
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_gen")
    @SequenceGenerator(name = "user_gen",
    sequenceName = "user_seq",
    allocationSize = 1)
    private Long id;
@Column(name = "first_name")
    private String firstName;
@Column(name = "last_name")
    private String lastName;
@Column(unique = true)
    private String email;
    private int age;

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}

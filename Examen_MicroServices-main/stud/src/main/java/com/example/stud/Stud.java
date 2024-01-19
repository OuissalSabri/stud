package com.example.stud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stud {

    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer courseId;

}

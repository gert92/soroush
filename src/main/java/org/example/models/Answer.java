package org.example.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Answer {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private boolean correct;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}

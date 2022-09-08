package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Question {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;
    private int difficulty;
    private String title;
    @OneToMany
    @JoinColumn(name = "answers_id")
    private List<Answer> answers;


}

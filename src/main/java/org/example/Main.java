package org.example;

import org.example.models.Question;
import org.example.repositories.QuestionRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuestionRepo questionRepo = new QuestionRepo();

//        Question question = new Question();
//        question.setTitle("Is Mike really a sandwich and not a human?");

        List<Question> questions = questionRepo.getQuestions();

//        questions.get(0).setDifficulty(2);

//        questionRepo.updateQuestion(questions.get(0));


        questions.forEach(System.out::println);
    }
}
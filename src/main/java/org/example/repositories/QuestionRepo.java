package org.example.repositories;

import org.example.models.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class QuestionRepo {
    private final Session session = SessionMgr.getSession();

    public List<Question> getQuestions(){
        Transaction tx = session.beginTransaction();
        List<Question> question = session.createQuery("from Question", Question.class).list();
        tx.commit();
        return question;
    }

    public void createQuestion(Question question){
        Transaction tx = session.beginTransaction();
        session.persist(question);
        tx.commit();
    }

    public void updateQuestion(Question question){
        Transaction tx = session.beginTransaction();
        session.persist(question);
        tx.commit();
    }
}

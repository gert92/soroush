package org.example.repositories;

import org.example.models.Answer;
import org.example.models.Question;
import org.example.models.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionMgr {

    public static Session getSession(){
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Answer.class)
                .addAnnotatedClass(Question.class)
                .addAnnotatedClass(Topic.class)
                .buildSessionFactory();

        return sessionFactory.openSession();
    }


}

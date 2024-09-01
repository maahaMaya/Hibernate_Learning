package com.sourav.mapping.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sourav.HibernateUtil;

public class OneToOneBiDirectionalMapping {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);

		QuestionsEntity q1 = new QuestionsEntity();
		q1.setQuestion_id(1212);
		q1.setQuestion("What is Java?");
		
		
		AnswersEntity a1 = new AnswersEntity();
		a1.setAnswer_id(343);
		a1.setAnswer("Java Answer 1");


		AnswersEntity a2 = new AnswersEntity();
		a2.setAnswer("Java Answer 2");
		a2.setAnswer_id(347);
		
		List<AnswersEntity> listAnswer = new ArrayList<AnswersEntity>();
		listAnswer.add(a1);
		listAnswer.add(a2);
		q1.setListAnswersEntity(listAnswer);
		

		


	

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(a2);
		session.save(a1);
		session.save(q1);

		


		transaction.commit();

		session.close();

	}
}


package com.sourav.mapping.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sourav.HibernateUtil;

public class OneToOneUniDirectionalMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);

		QuestionsEntity q1 = new QuestionsEntity();
		AnswersEntity a1 = new AnswersEntity();
		q1.setQuestion_id(1212);
		q1.setQuestion("What is Java?");
		a1.setAnswer_id(343);
		a1.setAnswer("Java Answer");
		q1.setAnswersEntity(a1);

		QuestionsEntity q2 = new QuestionsEntity();
		AnswersEntity a2 = new AnswersEntity();
		q2.setQuestion_id(242);
		q2.setQuestion("What is C#?");
		a2.setAnswer_id(347);
		a2.setAnswer("C# Answer");
		q2.setAnswersEntity(a2);

		QuestionsEntity q3 = new QuestionsEntity();
		AnswersEntity a3 = new AnswersEntity();
		q3.setQuestion_id(2411);
		q3.setQuestion("What is JS?");
		a3.setAnswer_id(390);
		a3.setAnswer("JS Answer");
		q3.setAnswersEntity(a3);

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(a1);
		session.save(q1);

		session.save(a2);
		session.save(q2);

		session.save(a3);
		session.save(q3);

		transaction.commit();

		session.close();

	}

}

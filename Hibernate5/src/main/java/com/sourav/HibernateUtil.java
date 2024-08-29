package com.sourav;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.sourav.entity.Employee;
import com.sourav.entity.Student;
import com.sourav.mapping.one_to_one.AnswersEntity;
import com.sourav.mapping.one_to_one.QuestionsEntity;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				
				Properties properties = new Properties();
				properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/gfive");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "12345");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				properties.put(Environment.HBM2DDL_AUTO, "update");
				properties.put(Environment.SHOW_SQL, "true");
				
				configuration.setProperties(properties);
				configuration.addAnnotatedClass(Student.class);
				configuration.addAnnotatedClass(Employee.class);
				
				configuration.addAnnotatedClass(QuestionsEntity.class);
				configuration.addAnnotatedClass(AnswersEntity.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				
				sessionFactory =  configuration.buildSessionFactory(serviceRegistry);
				
				System.out.println( "File Conig -> SessionFactoryObject ::  " + sessionFactory );
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}

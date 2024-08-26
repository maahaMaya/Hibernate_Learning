package com.sourav;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sourav.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//XML Configuration
    	//Configuration configuration = new Configuration();
    	//configuration.configure(); // for reading hibernate.cfg.xml file
    	//SessionFactory sessionFactory = configuration.buildSessionFactory(); // read each property/information of the hibernate.cfg.xml file 
        
    	//SessionFactory sessionFactory = new Configuration().configure("AnyName(hibernate).xml").buildSessionFactory(); // config file change
    	//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	//System.out.println( "XML Config -> SessionFactoryObject ::  " + sessionFactory );
    	
    	//File Configuration
    	//HibernateUtil hibernateUtilFileConfig = new HibernateUtil();
    	//hibernateUtilFileConfig.getSessionFactory();
    	
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	 	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	Student student = new Student(1, "Sourav", "s@gmail.com", "Ind"); 
    	session.save(student);
    	
    	transaction.commit();
    	
    	session.close();
    }
}

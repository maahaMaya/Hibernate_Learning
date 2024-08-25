package com.sourav.Hibernate5;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Configuration configuration = new Configuration();
    	//configuration.configure(); // for reading hibernate.cfg.xml file
    	//SessionFactory sessionFactory = configuration.buildSessionFactory(); // read each property/information of the hibernate.cfg.xml file 
        
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	//SessionFactory sessionFactory = new Configuration().configure("AnyName(hibernate).xml").buildSessionFactory(); // config file change
    	System.out.println( "SessionFactoryObject ::  " + sessionFactory );
    }
}

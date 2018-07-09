package com.util;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;



public class HibernateUtil
{
    private static SessionFactory sessionFactory = null;
    
    static {
        initialize();
    }

    public static void initialize()
    {
        try {
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory(
                new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties())
                    .build()
            );
        } catch(HibernateException e) {
            System.out.println(e);
        }
    }
    
    public static void shutdown()
    {
        sessionFactory.close();
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    
    public static Session openSession()
    {
        return sessionFactory.openSession();
    }
}

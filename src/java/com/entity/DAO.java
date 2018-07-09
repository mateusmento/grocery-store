package com.entity;

import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Query;
import java.util.List;


public abstract class DAO
{
    public void save()
    {
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        session.save(this);
        session.getTransaction().commit();
        session.close();
    }

    public static <T> List<T> find(String query)
    {
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        List<T> list = session.createQuery(query).list();
        session.getTransaction().commit();
        session.close();
        return list;
    }
    
    public static <T> T findFirst(String query)
    {
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        T one = (T)session.createQuery(query).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return one;
    }
}

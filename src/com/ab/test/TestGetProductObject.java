package com.ab.test;

import com.ab.entity.Product;
import com.ab.utility.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestGetProductObject {
    public static void main(String[] args) {
        // get session factory object
        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();

        // get session object
        Session session = HibernateUtility.getSession();

        try {
            // load the object
            Product product = session.get(Product.class,1001);
            if (product == null)
                System.out.println("Product not found with id: " + 1001);
            else
                System.out.println(product);
        } catch (HibernateException hbe) {
            hbe.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            HibernateUtility.closeSession(session);
            HibernateUtility.closeSessionFactory();
        }
    }
}
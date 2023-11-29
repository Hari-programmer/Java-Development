package com.hari.DemoHiberanate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Performer performer = new  Performer();
       
       performer.setId(001);
       performer.setName("Hari");
       performer.setPhn(995957);
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Performer.class);
       ServiceRegistry re =new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf= con.buildSessionFactory(re);
       Session sess= sf.openSession();
       Transaction tx = sess.beginTransaction();
       
       sess.save(performer);
       tx.commit();
       
    
    }
}
























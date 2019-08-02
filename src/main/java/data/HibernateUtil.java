package data;

import data.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();


    private static SessionFactory buildSessionFactory(){


        try{
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(User.class);
            StandardServiceRegistryBuilder serviceBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            configuration.buildSessionFactory(serviceBuilder.build());
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("There was an error building the factory");
        }
        return null;
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }


}

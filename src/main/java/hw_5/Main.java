package hw_5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Session session = getSessionFactory().openSession();
        StudentRepository studentRepository = new StudentRepository(session);
//        System.out.println(studentRepository.findAll());
        System.out.println(studentRepository.findById(1));

    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new
                StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
//        return new org.hibernate.cfg.Configuration()
//                .configure("hibernate.cfg.xml")
//                .buildSessionFactory();
    }
}

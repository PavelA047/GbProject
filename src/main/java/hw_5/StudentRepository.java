package hw_5;

import org.hibernate.Session;

import java.util.List;

public class StudentRepository {
    private final Session session;

    public StudentRepository(Session session) {
        this.session = session;
    }

    @SuppressWarnings("unchecked")
    public List<Student> findAll() {
        return (List<Student>)
                session.createQuery("from Student", Student.class).list();
    }

    public Student findById(int id) {
        return session.get(Student.class, id);
    }

    public void persist(Student student) {
        session.save(student);
    }

    public void update(Student student) {
        session.update(student);
    }

    public void delete(Student student) {
        session.delete(student);
    }

    public void deleteAll() {
        List<Student> entityList = findAll();
        for (Student entity : entityList) {
            delete(entity);
        }
    }
}

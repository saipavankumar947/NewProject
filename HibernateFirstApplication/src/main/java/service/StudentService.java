package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;

public class StudentService {
public static void main(String[] args) {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
//	Student s=new Student(6,"Student666",25);
//	session.save(s);
//	session.update(s);
//	Student s1=(Student) session.get(Student.class, 2);
//	System.out.println(s1);
//	session.delete(s1);
//	session.beginTransaction().commit();
//	session.close();
	List<Student> list = session.createQuery("from Student").list();
	for (Student student : list) {
		System.out.println(student);
	}
	
}
}

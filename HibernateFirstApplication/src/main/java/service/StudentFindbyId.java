package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;

public class StudentFindbyId {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Student s1=(Student) session.get(Student.class, 7);
		System.out.println(s1);
		session.beginTransaction().commit();
		session.close();
	
}
}
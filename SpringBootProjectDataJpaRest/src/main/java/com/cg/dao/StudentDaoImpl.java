package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDaoI {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void create(Student s) {
		em.persist(s); // This object will make a reference database table

	}

	@Override
	public List reterive() {
	Query q = em.createQuery("from Student s");
	return q.getResultList();	
		
	}

	@Override
	public Student findById(int id) {
		return em.find(Student.class, id);
		
	}

 	@Override
	public void delete(int id) {
	Student s=em.find(Student.class, id); // this method will find which id to delete
	System.out.println(s.getId()+" "+s.getName()+" "+s.getDept());
	em.remove(s);
	}

	@Override
	public void update(int id) {
		Student s=em.find(Student.class, id);
		s.setName("Mahabharat");
		System.out.println("updated");
		
	}
	
}

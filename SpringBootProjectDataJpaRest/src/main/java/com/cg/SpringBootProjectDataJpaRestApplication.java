package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@SpringBootApplication
public class SpringBootProjectDataJpaRestApplication /*implements CommandLineRunner */{

	@Autowired
	StudentDaoI studao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectDataJpaRestApplication.class, args);
	}

	//@Override
//	public void run(String... args) throws Exception {
		

//	This is for create method	
//		Student s1 = new Student(1,"sachin","cs");
//		Student s2 = new Student(2,"ravi","mech");
//		Student s3 = new Student(3,"nd","mech");
//		Student s4 = new Student(4,"sumit","mech");
//		studao.create(s1);
//		studao.create(s2);
//		studao.create(s3);
//		studao.create(s4);
//		System.out.println("record inserted");
		
//This is for reterive method
//	List<Student> studentlist =  studao.reterive();	
//	for(Student stu:studentlist)
//	{
//		System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getDept());
//	}
//	}

//This is for Find Method		
//		Student stu=studao.findById(3);
//		System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getDept());
	
//This is for Delete method
	//studao.delete(2);
	
//This is for update method	
//	studao.update(3);
		
}

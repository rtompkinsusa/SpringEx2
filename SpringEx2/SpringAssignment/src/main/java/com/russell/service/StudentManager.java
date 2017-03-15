package com.russell.service;

import com.russell.dao.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentManager {
  
    
	public static void main(String[] args) {

              ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
              Student aStudent = (Student) context.getBean("student");
              aStudent.displayStudent();

              Student myStudent;
              myStudent = new Student();

              Object grade = myStudent.getGrade();
              Object address = myStudent.getAddress();

            System.out.println(myStudent.firstName +"\n" + address + " \n" + grade);
	}
}
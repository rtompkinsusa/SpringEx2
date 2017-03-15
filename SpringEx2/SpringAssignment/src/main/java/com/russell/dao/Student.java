
package com.russell.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    public String firstName;
    public String lastName;
    public String dob;
    
    public Student(String fname, String lname, String dob){
        this.firstName = fname;
        this.lastName = lname;
        this.dob = dob;
    }
    public Student(){
      }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDob(){
        return dob;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setdob(String dob) {
        this.dob = dob;
    }

    public Object getGrade(){
 
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Grade grade = (Grade) context.getBean("grade");
        return grade;
    }
    
    public Object getAddress(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");                  
        Address address = (Address) context.getBean("address");
        return address;
    }
    
    public Object getStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Student student = (Student) context.getBean("student");
        return student;
    }

    public void displayStudent(){
        System.out.println(firstName + " " + lastName + " " + dob);
    }
 
    @Override
            public String toString(){
                return firstName + " " + lastName + " " + dob;
            }
            
    
}

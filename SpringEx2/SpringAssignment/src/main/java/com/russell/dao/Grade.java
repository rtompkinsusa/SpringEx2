
package com.russell.dao;


public class Grade {
        
    private String subject;
    private String letterGrade;
    
    public String getSubject(){
        return subject;
    }
    
    public String getLetterGrade(){
        return letterGrade;
    }
    
    public void setsubject(String subject){
        this.subject = subject;
    }
    public void setlettergrade(String lettergrade){
        this.letterGrade = lettergrade;
    }
    
    @Override
    public String toString(){
        return "Subject: " + subject + " Grade: " + letterGrade;
        
    }
    
}

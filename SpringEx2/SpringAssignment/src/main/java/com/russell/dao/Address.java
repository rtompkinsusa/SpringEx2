
package com.russell.dao;


public class Address {
    
    private String street;
    private String city;
    private String zip;
    
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getZip(){
        return zip;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    
    @Override
    public String toString(){
        return "Address: " + street + " " + city + " " + zip;
        
    }
    
}

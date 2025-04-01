package com.week2.inheritance;

public class Parent {

    protected String surname;
    protected String address;
    public Parent(String surname,String address){
        this.surname=surname;
        this.address=address;
    }

    public void display(){
        System.out.println("surname is" +surname +" address"+address);
    }
}

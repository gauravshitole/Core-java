package com.week2.inheritance;

public class Child extends Parent{


    private String name;

    public Child(String username, String address, String  name) {
        super(username, address);
        this.name=name;



    }
    public void display(){
        System.out.println("surname is" +surname +" address"+address+ "  name"+name);
    }


}

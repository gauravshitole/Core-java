package com.week2;

public class Employee {
    public String name;
    String  companyName="pcs java Traning institude";

    public  void setCompanyName(String updateCompanyname){
        companyName=updateCompanyname;
    }
    private void  setName(String name){
        this.name=name;
    }
    private int age;
    String department;
     public void setAge(int ans){

         this.age=ans;
     }
     public  void setDepartment(String department){
         this.department=department;

     }
     public static void getSomeData(){
     }
     public  void display(){
         System.out.println("Name is " +name +"age is  "+age +" department is  " +department +" Company Name is "+companyName);
     }




}

package com.week2;

public class EmployeeStaticTest {
    public static void main(String[] args){
        Employee employee1=new Employee();
        employee1.setDepartment("it");
        employee1.setAge(30);
        employee1.name="virat";

   employee1.display();
   employee1.setCompanyName("Tcs");
        employee1.display();
    }
}

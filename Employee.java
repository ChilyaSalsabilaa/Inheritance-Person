package com.mycompany.person;
public class Employee extends Person {
    String name = "Chilya Salsabolaa";
    int age = 16;
    float salary = 4000f;
    
    //public Employee (string a, int b, float c);
    
    public void showInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("Salary : $" + this.salary);
    }
    //+this itu bisa diganti +super
    //kalo +this munculnya  extends atau sub class nya 
    //kalo +super munculnya induk atau super class nya
    
    public String showInfo(String a){ //beda method, dikasi paramenter didalem ()
        System.out.println("Name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("Salary : $" + this.salary);
        return a;
    } //ini overload (sama tujuan beda jalan)
}

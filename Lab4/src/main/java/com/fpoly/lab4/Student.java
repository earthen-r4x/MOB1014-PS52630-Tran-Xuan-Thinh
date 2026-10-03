/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab4;
import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private double gpa;
    
    public Student() {
        
    }

    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.setAge(age);
        this.setGpa(gpa);
    }
    
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.printf("Tuoi khong hop le\n");
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10) this.gpa = gpa;
        else System.out.printf("GPA khong hop le\n");
    }
    
    public void input(Scanner sc) {
        System.out.printf("Nhap ID: ");
        id = sc.nextLine();
        System.out.printf("Nhap ten: ");
        name = sc.nextLine();
        System.out.printf("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.printf("Nhap GPA: ");
        gpa = sc.nextDouble();
        sc.nextLine();
        
    }
    
    public String rank() {
        if (gpa >= 9.0) return "Excellent";
        else if (gpa >= 8.0) return "Very Good";
        else if (gpa >= 6.5) return "Good";
        else if (gpa >= 5.0) return "Average";
        else return "Fail";
    }
    
    public void output() {
        System.out.printf("ID: %s | Ho ten: %s | Tuoi: %d | GPA: %.2f | Xep loai: %s\n", id, name, age, gpa, rank());
    }
}

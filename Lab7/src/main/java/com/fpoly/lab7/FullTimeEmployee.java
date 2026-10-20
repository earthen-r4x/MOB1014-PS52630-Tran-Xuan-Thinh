/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author tranx
 */
public class FullTimeEmployee extends Employee {
    private double basicSalary;

    public FullTimeEmployee(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }
    
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    @Override
    public double getSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return String.format("[Chinh thuc] ID: %s | Ho ten: %s | Luong co ban: %.0f",
                id, name, getBasicSalary());
    }    
}

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
public class DongGoiSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sv = new Student("PS002", "Tran Thi Binh", 20, 7.0);
        sv.setGpa(12);
        System.out.println("GPA hien tai: " + sv.getGpa());
        sv.setGpa(9.2);
        sv.output();
    }
}

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
public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.printf("Nhap so luong sinh vien: ");
            n = sc.nextInt();
            if (n <= 0) System.out.println("So luong sinh vien phai lon hon 0, moi nhap lai");
        } while (n <= 0);
        sc.nextLine();
        
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh vien " + (i + 1));
            ds[i] = new Student();
            ds[i].input(sc);
        }
        
//        Xuat danh sach sinh vien
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < ds.length; i++) {
            ds[i].output();
        }
        
//        Sinh vien co gpa cao nhat
        Student max = ds[0];
        for (int i = 0; i < ds.length; i++) {
            if (ds[i].getGpa() > max.getGpa()) {
                max = ds[i];
            }
        }
        System.out.println("\n=== SINH VIEN CO GPA CAO NHAT ===");
        max.output();
        
//        Danh sach sinh vien sap xep giam dan theo gpa
        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = 0; j < ds.length - 1 - i; j++) {
                if (ds[j].getGpa() < ds[j + 1].getGpa()) {
                    Student temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        }
        System.out.println("\n=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ===");
        for (int i = 0; i < ds.length; i++) {
            ds[i].output();
        }
    }
}

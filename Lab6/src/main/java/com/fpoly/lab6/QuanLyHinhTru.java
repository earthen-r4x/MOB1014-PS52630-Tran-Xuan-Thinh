/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class QuanLyHinhTru {
    public static void main(String[] args) {
        List<Cylinder> list = new ArrayList<>();
        list.add(new Cylinder(1.0, "Do", 2.0));
        list.add(new Cylinder(2.0, "Xanh", 3.0));
        list.add(new Cylinder(1.5, "Vang", 4.0));
        list.add(new Cylinder(3.0, "Do", 1.0));
        list.add(new Cylinder(2.5, "Xanh", 2.0));
        
        System.out.println("=== DANH SACH HINH TRU ===");
        for(Cylinder cy : list) {
            System.out.println(cy);
        }
        
//        Tong the tich
        double tongTT = 0;
        for (Cylinder cy : list) {
            tongTT += cy.getVolume();
        }
        System.out.printf("Tong the tich: %.2f\n", tongTT);
        
//        Hinh tru the tich lon nhat
        System.out.println("Hinh tru co the tich lon nhat:");
        Cylinder ttMax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getVolume() > ttMax.getVolume()) {
                ttMax = list.get(i);
            }
        }
        System.out.println(ttMax);
        
//        Hinh tru tung mau
        Scanner sc = new Scanner(System.in);
        String nhapMau;
        System.out.print("Nhap mau: ");
        nhapMau = sc.nextLine();
        if (nhapMau.isEmpty()) {
            nhapMau = "null";
        }
        
        System.out.printf("=== HINH TRU MAU %s ===\n", nhapMau);
        boolean timMau = false;
        for (Cylinder cy : list) {
            if (cy.getColor().equalsIgnoreCase(nhapMau)) {
                System.out.println(cy);
                timMau = true;
            }
        }
        if (!timMau) {
            System.out.println("Khong co hinh tru mau " + nhapMau);
        }
    }
}

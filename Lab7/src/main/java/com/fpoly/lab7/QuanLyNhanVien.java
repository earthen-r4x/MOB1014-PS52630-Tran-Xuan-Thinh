/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tranx
 */
public class QuanLyNhanVien {
    public static void main(String[] args) {
        List<Employee> nv = new ArrayList<>();
        nv.add(new FullTimeEmployee("FT01", "Nguyen Van An", 12000000));
        nv.add(new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000));
        nv.add(new FullTimeEmployee("FT02", "Le Van Cuong", 15500000));
        nv.add(new PartTimeEmployee("PT02", "Pham Thi Dung", 120, 60000));
        nv.add(new PartTimeEmployee("PT03", "Hoang Van Em", 200, 90000));
        
        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (Employee e : nv) {
            System.out.printf("%s -> Luong: %.0f\n", e, e.getSalary());
        }
        
        double tong = 0.0;
        for (Employee e : nv) {
            tong += e.getSalary();
        }
        System.out.printf("Tong quy luong: %.0f\n", tong);
        
        Employee max = nv.get(0);
        for (Employee e : nv) {
            if (e.getSalary() > max.getSalary()) {
                max = e;
            }
        }
        System.out.printf("Nhan vien luong cao nhat: %s -> Luong: %.0f\n", max, max.getSalary());
        
        System.out.println("=== SAP XEP THEO LUONG GIAM DAN ===");
        Collections.sort(nv, (Employee nv1, Employee nv2) -> Double.compare(nv1.getSalary(), nv2.getSalary()));
        Collections.reverse(nv);
        for (Employee e : nv) {
            System.out.printf("%s -> Luong: %.0f\n", e, e.getSalary());
        }
    }
}

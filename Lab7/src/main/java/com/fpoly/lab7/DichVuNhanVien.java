/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

import java.util.List;

/**
 *
 * @author tranx
 */
public class DichVuNhanVien {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Employee[] ds = {
            new FullTimeEmployee("FT01", "Nguyen Van An", 12000000),
            new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000),
            new FullTimeEmployee("FT02", "Le Van Cuong", 15500000),
            new FullTimeEmployee("ft01", "Ngo Van Giang", 9000000)
        };
        
        for (Employee e : ds) {
            boolean ok = service.add(e);
            if (ok) System.out.println("Them thanh cong: " + e.getId());
            else System.out.println("Them that bai, trung ID: " + e.getId());
        }
        
        List<String> dsTim = List.of("pt01", "XX99");
        for (String d : dsTim) {
            Employee timNV = service.findById(d);
            if (timNV != null) System.out.println("Tim thay: " + timNV);
            else System.out.println("Khong tim thay nhan vien " + d);
        }
        
        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (Employee e : service.getAll()) {
            System.out.printf("%s -> Luong: %.0f\n", e, e.getSalary());
        }
        
        System.out.printf("Tong luong: %.0f%n", service.getTotalSalary());
    }
    
}

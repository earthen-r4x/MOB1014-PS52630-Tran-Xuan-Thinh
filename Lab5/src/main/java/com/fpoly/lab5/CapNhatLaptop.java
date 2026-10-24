/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class CapNhatLaptop {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));
        
        Scanner sc = new Scanner(System.in);
        String editID, editName;
        
        while (true) {
            System.out.printf("Nhap id can sua: ");
            editID = sc.nextLine();
            if (editID.isEmpty()) {
                System.out.println("Vui long nhap id");
                continue;
            }
            
            Laptop timID = null;
            for (Laptop lp : list) {
                if (lp.getId().equalsIgnoreCase(editID)) {
                    timID = lp;
                    break;
                }
            }
            
            if (timID == null) {
                System.out.println("Khong tim thay laptop co ID " + editID);
                continue;
            }
            
            while (true) {
                System.out.print("Nhap ten san pham moi: ");
                editName = sc.nextLine().trim();
                if (editName.isEmpty()) {
                    System.out.println("Ten san pham khong de trong");
                    continue;
                }
                
                timID.setName(editName);
                System.out.println("Da cap nhat laptop " + editID);
                break;
            }
            
            break;
        }
        
        int delCount = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getQuantity() <= 0) {
                list.remove(i);
                delCount++;
            }
        }
        System.out.println("Da xoa " + delCount + " laptop het hang");
        
        System.out.printf("=== DANH SACH SAU CAP NHAT (%d may) ===\n", list.size());
        for (Laptop lp : list) {
            lp.output();
        }
    }
}

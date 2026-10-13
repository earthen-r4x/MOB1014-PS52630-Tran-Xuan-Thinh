/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tranx
 */
public class SapXepLaptop {
   public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));
        
        System.out.println("=== SAP XEP THEO TEN (A-Z) ===");
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).getName().compareToIgnoreCase(list.get(j + 1).getName()) > 0) {
                    Laptop temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
//                    Collections.swap(list, j, j + 1);
                }
            }
        }
        for (Laptop lp : list) {
            lp.output();
        }
        
        System.out.println("=== SAP XEP THEO GIA GIAM DAN ===");
        Collections.sort(list, (Laptop lp1, Laptop lp2) -> Double.compare(lp1.getPrice(), lp2.getPrice()));
        Collections.reverse(list);
        for (Laptop lp : list) {
            lp.output();
        }
   } 
}

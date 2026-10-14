/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab5;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author tranx
 */
public class TimKiemLaptop {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));
        
        Scanner sc = new Scanner(System.in);
        double min, max;
        boolean timGia = false, timKey = false;
        String keyword = "";
        do {
            System.out.printf("Nhap gia thap: ");
            min = Integer.parseInt(sc.nextLine());
            System.out.printf("Nhap gia cao: ");
            max = Integer.parseInt(sc.nextLine());
            if (min < 0|| max < 0 || min > max) {
                System.out.println("Khoang gia khong hop le");
            }
            else {
                System.out.printf("Nhap tu khoa tim kiem: ");
                keyword = sc.nextLine();
                if (keyword.isEmpty()) {
                    System.out.println("Vui long nhap tu khoa tim kiem!");
                    continue;
                }
                break;
            }
        } while (true);
        
        System.out.printf("\n=== LAPTOP GIA TU %.0f DEN %.0f ===\n", min, max);
        for (Laptop lp : list) {
            if (min <= lp.getPrice() && lp.getPrice() <= max) {
                lp.output();
                timGia = true;
            }
        }
        if (!timGia) {
            System.out.println("Khong tim thay laptop nao");
        }
        System.out.printf("=== KET QUA TIM KIEM \"%s\" ===\n", keyword);
        keyword = keyword.toLowerCase();
        for (Laptop lp : list) {
            if (lp.getName().toLowerCase().contains(keyword) || lp.getId().equalsIgnoreCase(keyword)) {
                lp.output();
                timKey = true;
            }
        }
        if (!timKey) {
            System.out.println("Khong tim thay laptop nao");
        }
    }
}

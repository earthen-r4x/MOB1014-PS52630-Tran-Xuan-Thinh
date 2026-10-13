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
public class NhapXuatLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        int dem = 0;
        do {
            dem++;
            System.out.println("San pham " + dem);
            Laptop lp = new Laptop();
            lp.input(sc);
            list.add(lp);
            System.out.printf("Tiep tuc nhap? (y/n) >> ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
        
        System.out.printf("=== DANH SACH LAPTOP (%d may) ===\n", list.size());
        for (Laptop lp : list) {
            lp.output();
        }
    }
}

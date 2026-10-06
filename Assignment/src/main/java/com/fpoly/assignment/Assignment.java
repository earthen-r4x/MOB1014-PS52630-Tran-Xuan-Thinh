/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fpoly.assignment;
import java.util.Scanner;
/**
 *
 * @author tranx
 */
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SanPham sp = null;
        boolean daThem = false;
        int chon;
        do {
            System.out.println("\n=== Menu quan ly san pham ===");
            System.out.println("1. Nhap thong tin san pham");
            System.out.println("2. Hien thi thong tin san pham");
            System.out.println("3. Cap nhat san pham");
            System.out.println("0. Thoat");
            System.out.printf("Lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            System.out.printf("\n");
            
            switch (chon) {
                case 1 -> {
                    if (daThem) {
                        System.out.println("San pham nay da duoc them roi!");
                    }
                    else {
                        sp = new SanPham();
                        sp.Nhap(sc);
                        daThem = true;
                    }
                }
                case 2 -> {
                    if (!daThem) {
                        System.out.println("San pham chua co, vui long them truoc!");
                    }
                    else sp.Xuat();
                }
                case 3 -> {
                    if (!daThem) {
                        System.out.println("San pham chua co, vui long them truoc!");
                    }
                    else sp.capNhat(sc);
                }
                case 0 -> System.out.println("Ket thuc chuong trinh");
                default -> System.out.println("Lua chon khong hop le");
            }
        } while (chon != 0);
    }
}

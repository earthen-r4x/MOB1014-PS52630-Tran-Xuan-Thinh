/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab2;
import java.util.Scanner;
/**
 *
 * @author tranx
 */
public class XepLoaiHocLuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double DiemTB, Toan, Ly, Hoa;
        String XepLoai = "";
        System.out.printf("Nhap diem Toan: ");
        Toan = sc.nextDouble();
        System.out.printf("Nhap diem Ly: ");
        Ly = sc.nextDouble();
        System.out.printf("Nhap diem Hoa: ");
        Hoa = sc.nextDouble();
        
        if (Toan > 10 || Toan < 0 || Ly > 10 || Ly < 0 || Hoa > 10 || Hoa < 0) {
            System.out.printf("Diem khong hop le");
            return;
        }
        
        DiemTB = (Toan * 2 + Ly + Hoa) / 4;
        if (DiemTB >= 8.0) {
            XepLoai = "Gioi";
        }
        else if (DiemTB >= 6.5) {
            XepLoai = "Kha";
        }
        else if (DiemTB >= 5.0) {
            XepLoai = "Trung binh";
        }
        else {
            XepLoai = "Yeu";
        }
        
        System.out.printf("Diem trung binh: %.2f\nXep loai: %s", DiemTB, XepLoai);
    }
}

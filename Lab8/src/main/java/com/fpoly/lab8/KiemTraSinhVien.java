/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab8;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author tranx
 */
public class KiemTraSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name, phone, email;
//        MaSV
        do {
            System.out.print("Nhap ma SV: ");
            id = sc.nextLine().trim();
            if (id.isEmpty()) System.out.println("Vui long nhap ma SV!");
            else if (id.matches("^SV[0-9]{3}$")) break;
            else System.out.println("Ma SV phai co dang SVxxx (x la chu so)");
        } while (true);
            
//        Ho ten
        do {
            System.out.print("Nhap ho ten: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) System.out.println("Vui long nhap ho ten!");
            else if (name.matches("^[\\p{L} ]+$")) break;
            else System.out.println("Ho ten chi duoc chua chu cai va khoang trang");
        } while (true);
            
//        So dien thoai
        Pattern patternPhone = Pattern.compile("^0[0-9]{9}$");
        do {
            System.out.print("Nhap so dien thoai: ");
            phone = sc.nextLine().trim();
            if (phone.isEmpty()) System.out.println("Vui long nhap so dien thoai!");
            else if (patternPhone.matcher(phone).matches()) break;
            else System.out.println("So dien thoai phai bat dau bang 0 va co 10 chu so");
        } while (true);
            
//        Email
        do {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (email.isEmpty()) System.out.println("Vui long nhap email!");
            else if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) break;
            else System.out.println("Email khong dung dinh dang");
        } while (true);
        
        System.out.println("=== THONG TIN SINH VIEN HOP LE ===");
        System.out.println("Ma SV: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("So dien thoai: " + phone);
        System.out.println("Email: " + email);
    }
}

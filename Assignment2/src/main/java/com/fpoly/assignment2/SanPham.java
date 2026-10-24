/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.assignment2;

import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class SanPham {
    public String maSP;
    public String tenSP;
    public double donGia;
    public int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.setDonGia(donGia);
        this.setSoLuong(soLuong);
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else System.out.println("Gia san pham phai lon hon 0");
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else System.out.println("So luong san pham phai la so nguyen");
    }
    
    public void Nhap(Scanner sc) {
        do {
            System.out.print("Nhap ma san pham: ");
            this.maSP = sc.nextLine();
            if (maSP.matches("^SP[\\d]{3}$")) break;
            else System.out.println("Ma san pham phai co dang SPXXX voi XXX la 3 so tu nhien!");
        } while (true);
        
        do {
            System.out.print("Nhap ten san pham: ");
            this.tenSP = sc.nextLine();
            if (tenSP.isEmpty()) System.out.println("Ten san pham khong duoc de trong!");
            else break;
        } while (true);
        
        do {
            System.out.print("Nhap gia san pham: ");
            this.donGia = Double.parseDouble(sc.nextLine());
            if (donGia < 0) System.out.println("Gia san pham phai lon hon 0");
            else break;
        } while (true);
        
        do {
            System.out.print("Nhap so luong san pham: ");
            this.soLuong = Integer.parseInt(sc.nextLine());
            if (soLuong < 0) System.out.println("So luong san pham phai la so nguyen");
            else break;
        } while (true);
    }
    public void Xuat() {
        System.out.printf("%-5s | %-30s | %15.2f | %5d | %18.2f | ",
                this.maSP, this.tenSP, this.donGia, this.soLuong, thanhTien());
    }
    
    public double thanhTien() {
        return soLuong * donGia;
    }
    public void capNhat(Scanner sc) {
        do {
            System.out.print("Nhap ten san pham: ");
            this.tenSP = sc.nextLine();
            if (tenSP.isEmpty()) System.out.println("Ten san pham khong duoc de trong!");
            else break;
        } while (true);
        
        do {
            System.out.print("Nhap gia san pham: ");
            this.donGia = Double.parseDouble(sc.nextLine());
            if (donGia < 0) System.out.println("Gia san pham phai lon hon 0");
            else break;
        } while (true);
        
        do {
            System.out.print("Nhap so luong san pham: ");
            this.soLuong = Integer.parseInt(sc.nextLine());
            if (soLuong < 0) System.out.println("So luong san pham phai la so nguyen");
            else break;
        } while (true);
    };

    @Override
    public String toString() {
        return maSP + " - " + tenSP; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

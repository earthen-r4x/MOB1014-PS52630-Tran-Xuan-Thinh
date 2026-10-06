/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.assignment;
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

    public SanPham() {}
    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public void Nhap(Scanner sc) {
        System.out.printf("Nhap ma san pham: ");
        maSP = sc.nextLine();
        System.out.printf("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.printf("Nhap so luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();
    }
    
    public void Xuat() {
        System.out.printf("""
                          ----- Thong tin san pham -----
                          Ma san pham: %s
                          Ten san pham: %s
                          Don gia: %.2f
                          So luong: %d
                          Thanh tien: %.2f VND
                          ------------------------------
                          """, maSP, tenSP, donGia, soLuong, thanhTien());
    }
    
    public double thanhTien() {
        return soLuong * donGia;
    }
    
    public void capNhat(Scanner sc) {
        System.out.printf("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.printf("Nhap so luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        System.out.printf("Cap nhat thanh cong\n");
    }
    
}

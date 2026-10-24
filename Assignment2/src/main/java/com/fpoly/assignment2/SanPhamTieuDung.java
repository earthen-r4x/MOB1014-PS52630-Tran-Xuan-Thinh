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
public class SanPhamTieuDung extends SanPham {
    public String thoiHan;

    public SanPhamTieuDung() {
        super();
    }

    public SanPhamTieuDung(String maSP, String tenSP, double donGia, int soLuong, String thoiHan) {
        super(maSP, tenSP, donGia, soLuong);
        this.thoiHan = thoiHan;
    }

    public String getThoiHan() {
        return thoiHan;
    }
    
    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }
    
    @Override
    public double thanhTien() {
        return super.thanhTien();
    }

    public double getThanhTien() {
        return thanhTien();
    }

    @Override
    public void capNhat(Scanner sc) {
        super.capNhat(sc);
        System.out.print("Nhap thoi han: ");
        this.thoiHan = sc.nextLine().trim();
    }

    @Override
    public void Xuat() {
        super.Xuat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Han su dung: " + thoiHan + "%");
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap thoi han: ");
        this.thoiHan = sc.nextLine().trim();
    }
    

    
    
}

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
public class SanPhamDienTu extends SanPham {
    public String ngayBaoHanh;

    public SanPhamDienTu() {
        super();
    }

    public SanPhamDienTu(String maSP, String tenSP, double donGia, int soLuong, String ngayBaoHanh) {
        super(maSP, tenSP, donGia, soLuong);
        this.ngayBaoHanh = ngayBaoHanh;
    }

    public String getBaoHanh() {
        return ngayBaoHanh;
    }

    public void setBaoHanh(String ngayBaoHanh) {
        this.ngayBaoHanh = ngayBaoHanh;
    }

    @Override
    public void capNhat(Scanner sc) {
        super.capNhat(sc);
        System.out.print("Nhap thoi gian bao hanh: ");
        this.ngayBaoHanh = sc.nextLine().trim();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Bao hanh: " + ngayBaoHanh);
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Nhap thoi gian bao hanh: ");
        this.ngayBaoHanh = sc.nextLine().trim();
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fpoly.assignment2;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class Assignment2 {
    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<SanPham> ds = new ArrayList<>();
    static void khoiTaoDuLieu() {
        ds.add(new SanPhamDienTu("SP001", "iPhone 15 Pro Max", 34990000, 10, "12 thang"));
        ds.add(new SanPhamDienTu("SP002", "Samsung Galaxy S24", 22990000, 15, "12 thang"));
        ds.add(new SanPhamDienTu("SP003", "Laptop Dell XPS 13", 28500000, 8, "24 thang"));
        ds.add(new SanPhamDienTu("SP004", "Tai nghe Sony WH-1000", 7490000, 20, "12 thang"));
        ds.add(new SanPhamDienTu("SP005", "Man hinh LG 27 inch", 5990000, 12, "36 thang"));
        ds.add(new SanPhamTieuDung("SP006", "Nuoc mam Phu Quoc", 45000, 100, "15/2/2022"));
        ds.add(new SanPhamTieuDung("SP007", "Gao ST25 tui 5kg", 180000, 80, "30/2/2022"));
        ds.add(new SanPhamTieuDung("SP008", "Dau an Tuong An 1L", 65000, 150, "12/7/2025"));
        ds.add(new SanPhamTieuDung("SP009", "Sua Vinamilk 1L", 32000, 200, "1/5/2012"));
        ds.add(new SanPhamTieuDung("SP010", "Bot giat Omo 3kg", 145000, 60, "12/12/2026"));
    }
    public static void main(String[] args) {
        khoiTaoDuLieu();
        int chon;
        
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Cap nhat san pham");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Xoa san pham");
            System.out.println("6. Sap xep danh sach theo ten");
            System.out.println("0. Thoat");
            chon = nhapChon();
            switch (chon) {
                case 1: themSanPham(); break;
                case 2: hienThi(); break;
                case 3: capNhat(); break;
                case 4: timKiem(); break;
                case 5: xoa(); break;
                case 6: sapXep(); break;
                case 0: System.out.println("Ket thuc chuong trinh"); break;
                default: System.out.println("Lua chon khong hop le");
            }
        } while (chon != 0);
        sc.close();
    }
    
    static int nhapChon() {
        while (true) {
            try {
                System.out.print("Lua chon: ");
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so");
            }
        }
    }
    
    static void themSanPham() {
        System.out.println("Loai san pham:");
        System.out.println("1. San pham dien tu");
        System.out.println("2. San pham tieu dung");

        SanPham sp;
        switch (nhapChon()) {
            case 1: sp = new SanPhamDienTu(); break;
            case 2: sp = new SanPhamTieuDung(); break;
            default:
                System.out.println("Loai khong hop le!");
                return;
        }

        while (true) {
            sp.Nhap(sc);
            if (timTheoMa(sp.getMaSP()) != null) {
                System.out.println("Ma SP da ton tai. Nhap lai toan bo");
                continue;
            }
            break;
        }
        ds.add(sp);
        System.out.println("Them thanh cong");
    }
    
    static void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
        tieuDe();
        for (SanPham sp : ds) {
            sp.Xuat();
        }
    }

    static void tieuDe() {
        System.out.println("\n================ DANH SACH SAN PHAM ================");
        System.out.printf("%-5s | %-30s | %15s | %5s | %18s | %s\n",
                "Ma SP", "Ten SP", "Don gia", "SL", "Thanh tien", "Bao hanh/Han su dung");
    }

    static void capNhat() {
        System.out.print("Nhap ma SP can cap nhat: ");
        SanPham sp = timTheoMa(sc.nextLine().trim());
        if (sp == null) {
            System.out.println("Khong tim thay");
            return;
        }
        System.out.println("--- Thong tin cu ---");
        sp.Xuat();
        sp.capNhat(sc);
        System.out.println("Cap nhat thanh cong");
    }
    
    static void timKiem() {
        System.out.print("Nhap tu khoa: ");
        String key = sc.nextLine().trim().toLowerCase();

        boolean found = false;
        tieuDe();
        for (SanPham sp : ds) {
            boolean match = false;
            if (sp.getMaSP().toLowerCase().equalsIgnoreCase(key) || sp.getTenSP().toLowerCase().contains(key)) match = true;
            if (match) {
                sp.Xuat();
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay san pham nao");
    }


    static void xoa() {
        System.out.print("Nhap ma SP can xoa: ");
        SanPham sp = timTheoMa(sc.nextLine().trim());
        if (sp == null) {
            System.out.println("Khong tim thay!");
            return;
        }
        System.out.println("Da xoa " + sp.getTenSP());
        ds.remove(sp);
    }

    static void sapXep() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        Collator viCollator = Collator.getInstance(new Locale("vi", "VN"));
        ds.sort((a, b) -> viCollator.compare(a.getTenSP(), b.getTenSP()));
        System.out.println("Da sap xep theo ten!");
        hienThi();
    }

    static SanPham timTheoMa(String ma) {
        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) return sp;
        }
        return null;
    }
}

package com.fpoly.lab8;

import java.util.Scanner;

public class XuLyHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hoTen;
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        if (hoTen.trim().isEmpty()) {
            System.out.println("Ho ten khong duoc de trong");
            return;
        }

        hoTen = hoTen.trim();
        System.out.printf("Sau trim: %s (%d ky tu)\n", hoTen, hoTen.length());

        hoTen = hoTen.replaceAll("\\s+", " ");
        System.out.println("Chuan hoa khoang trang: " + hoTen);

        System.out.println("In hoa: " + hoTen.toUpperCase());

        String[] tu = hoTen.toLowerCase().split(" ");
        System.out.println("So tu: " + tu.length);

        String ketQua = "";

        for (int i = 0; i < tu.length; i++) {
            tu[i] = tu[i].substring(0, 1).toUpperCase().concat(tu[i].substring(1));
            ketQua = ketQua.concat(tu[i] + " ");
        }

        ketQua = ketQua.trim();

        System.out.println("Ho ten chuan: " + ketQua);

        sc.close();
    }
}
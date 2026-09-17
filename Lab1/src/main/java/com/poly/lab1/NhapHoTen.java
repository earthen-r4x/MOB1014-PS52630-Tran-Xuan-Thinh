/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;

import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class NhapHoTen {
    public static void main(String[] args) {
        String ten;
        int namSinh;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ho ten: ");
        ten = sc.nextLine();
        System.out.printf("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.printf("Ho va ten: %s\nTuoi: %d", ten, 2026 - namSinh);
    }
}

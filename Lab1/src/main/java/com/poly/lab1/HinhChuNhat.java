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
public class HinhChuNhat {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        int cd, cr, cv, dt;
        System.out.printf("Nhap chieu dai: ");
        cd = sc.nextInt();
        System.out.printf("Nhap chieu rong: ");
        cr = sc.nextInt();
        cv = (cd + cr) * 2;
        dt = cd * cr;
        System.out.printf("Chu vi hinh chu nhat: %d\nDien tich hinh chu nhat: %d", cv, dt);
    }
}

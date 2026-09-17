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
public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        // Chu vi = 2 × PI × banKinh; Diện tích = PI × banKinh × banKinh.
        double r, cv, dt;
        System.out.printf("Nhap ban kinh hinh tron: ");
        r = sc.nextDouble();
        cv = 2 * PI * r;
        dt = PI * r * r;
        System.out.printf("Chu vi hinh tron: %.2f\nDien tich hinh tron: %.2f", cv, dt);
    }
}

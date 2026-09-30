/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab3;
import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class XuLyMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max = 0, tong4 = 0;
        do {
           System.out.printf("Nhap n: ");
            n = sc.nextInt();
            
            if (n <= 0) {
                System.out.println("n phai lon hon 0, moi nhap lai!");
            }
        } while (n <= 0);
        
        int[] a = new int[n];
        System.out.printf("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.printf("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }
        
        boolean soChan = false;
        System.out.printf("\nCac phan tu chan: ");
        for (int i : a) {
            if (i % 2 != 0) {
                continue;
            }
            
            System.out.printf("%d ", i);
            soChan = true;
        }
        if (!soChan) {
            System.out.printf("Khong co phan tu chan!");
        }
        
        for (int i = 0; i < n; i++) {
            if (a[i] % 4 == 0) {
                tong4 += a[i];
            }
        }
        System.out.printf("\nTong cac so chia het cho 4: %d", tong4);
        
        max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.printf("\nGia tri lon nhat: %d", max);
    }
}

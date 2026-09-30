/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab3;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author tranx
 */
public class TimKiemSapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
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
        
        System.out.printf("Nhap gia tri x muon tim kiem: ");
        int x = sc.nextInt();
        boolean timThay = false;
        System.out.printf("Vi tri cua %d trong mang: ", x);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.printf("%d ", i);
                timThay = true;
            }
        }
        
        if (!timThay) {
            System.out.printf("Khong tim thay");
        }
        
        int[] b = Arrays.copyOf(a, a.length);
        // sort giam dan
        for (int i = 0; i < a.length -1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j]; // temp = 7
                    a[j] = a[j + 1]; // 7 rpl 5
                    a[j + 1] = temp; // 5 rpl 7
                }
            }
        }
        System.out.printf("\nMang giam dan (Bubble Sort): " + Arrays.toString(a));
        
        Arrays.sort(b);
        System.out.printf("\nMang tang dan (Arrays.sort): " + Arrays.toString(b));
    }
}

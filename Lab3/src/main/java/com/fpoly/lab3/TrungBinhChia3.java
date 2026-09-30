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
public class TrungBinhChia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, tong = 0;
        double trungBinh;
        System.out.printf("Nhap so: ");
        n = sc.nextInt();
        
        if (n <= 0) {
            System.out.printf("n phai la so nguyen duong");
            return;
        }
        
        System.out.printf("Cac so chia het cho 3: ");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
                tong = tong + i;
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Khong co so nao chia het cho 3");
        }
        else {
            trungBinh = (double) tong / count;
            System.out.printf("\nTong: %d\nTrung binh cong: %.2f", tong, trungBinh);
        }
    }
}

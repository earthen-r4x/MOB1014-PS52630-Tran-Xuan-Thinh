/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab2;
import java.util.Scanner;
/**
 *
 * @author tranx
 */
public class KiemTraSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Nhap so n: ");
        n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.printf("%d la so chan\n", n);
        }
        else {
            System.out.printf("%d la so le\n", n);
        }
        
        if (n > 0) {
            System.out.printf("%d la so duong\n", n);
        }
        else if (n < 0) {
            System.out.printf("%d la so am\n", n);
        }
        else {
            System.out.printf("%d bang 0\n", n);
        }
    }
}

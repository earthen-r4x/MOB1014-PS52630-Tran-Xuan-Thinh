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
public class NhapSoHopLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so, soLanNhap = 0;
        
        do {
            System.out.printf("Nhap so: ");
            so = sc.nextInt();
            soLanNhap++;
            
            if (so <= 0 || so % 3 != 0 || so % 5 != 0) {
                System.out.println("So khong hop le, moi nhap lai!");
            }
            
        } while (so <= 0 || so % 3 != 0 || so % 5 != 0);
        
        System.out.printf("So hop le: %d (sau %d lan nhap)", so, soLanNhap);
    }
}

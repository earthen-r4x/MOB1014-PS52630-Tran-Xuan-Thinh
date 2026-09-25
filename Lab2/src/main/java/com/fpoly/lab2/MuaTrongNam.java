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
public class MuaTrongNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang;
        System.out.printf("Nhap thang: ");
        thang = sc.nextInt();
        
        switch (thang) {
            case 1, 2, 3:
                System.out.printf("Thang %d: Mua xuan", thang);
                break;
            case 4, 5, 6:
                System.out.printf("Thang %d: Mua ha", thang);
                break;
            case 7, 8, 9:
                System.out.printf("Thang %d: Mua thu", thang);
                break;
            case 10, 11, 12:
                System.out.printf("Thang %d: Mua dong", thang);
                break;
            default:
                System.out.printf("Thang khong hop le");
                break;
        }
    }
}

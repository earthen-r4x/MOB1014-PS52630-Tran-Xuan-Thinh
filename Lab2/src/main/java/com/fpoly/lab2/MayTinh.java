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
public class MayTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        char op;
        System.out.printf("Nhap so a: ");
        a = sc.nextDouble();
        System.out.printf("Nhap so b: ");
        b = sc.nextDouble();
        System.out.printf("Nhap dau phep toan + - * /: ");
        op = sc.next().charAt(0);
        
        switch (op) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", a, b, a + b);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", a, b, a - b);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", a, b, a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.printf("%.2f khong the chia het cho 0", b);
                }
                else {
                    System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
                }
                break;
            default:
                System.out.printf("Phep toan khong hop le");
                break;
        }
    }
}

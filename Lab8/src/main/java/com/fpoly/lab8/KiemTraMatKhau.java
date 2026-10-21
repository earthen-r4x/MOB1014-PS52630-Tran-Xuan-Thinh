/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab8;

import java.util.Scanner;

/**
 *
 * @author tranx
 */
public class KiemTraMatKhau {
    
    public static void kiemTra(String pw) throws InvalidPasswordException {
        if (pw.length() < 8) {
            throw new InvalidPasswordException ("Mat khau phai co it nhat 8 ky tu");
        }
        
        int chuHoa = 0, chuThuong = 0, chuSo = 0, kyTuDacBiet = 0;
    
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            
            if (Character.isUpperCase(c)) chuHoa++;
            else if (Character.isLowerCase(c)) chuThuong++;
            else if (Character.isDigit(c)) chuSo++;
            
            if ("!@#$%^&*".indexOf(c) >= 0) kyTuDacBiet++;
        }
        
        if (chuHoa < 2) throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu hoa");
        if (chuThuong < 2) throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu thuong");
        if (chuSo < 3) throw new InvalidPasswordException("Mat khau phai co it nhat 3 chu so");
        if (kyTuDacBiet < 1) throw new InvalidPasswordException("Mat khau phai co it nhat 1 ky tu dac biet (!@#$%^&*)");
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Nhap mat khau: ");
            String pw = sc.nextLine();
            
            try {
                kiemTra(pw);
                System.out.println("Mat khau hop le!");
                break;
            } catch (InvalidPasswordException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        } while (true);
    }
}

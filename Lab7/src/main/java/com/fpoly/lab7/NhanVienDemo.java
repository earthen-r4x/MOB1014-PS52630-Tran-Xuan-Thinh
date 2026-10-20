/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

import java.util.ArrayList;

/**
 *
 * @author tranx
 */
public class NhanVienDemo {
    public static void main(String[] args) {
        ArrayList<Employee> nv = new ArrayList<>();
        nv.add(new FullTimeEmployee("FT01", "Nguyen Van An", 12000000));
        nv.add(new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000));
        for (Employee e : nv) {
            System.out.printf("%s\nLuong: %.0f\n", e, e.getSalary());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tranx
 */
public class DanhSachHinh {
    public static void main(String[] args) {
        List<Circle> shapes = new ArrayList<>();
        shapes.add(new Circle(1, "Do"));
        shapes.add(new Cylinder(1, "Do", 2));
        shapes.add(new Circle(2, "Trang"));
        shapes.add(new Cylinder(2, "Xanh", 3));
        
        for (Circle s : shapes) {
            System.out.printf("%s -> getArea() = %.2f\n", s, s.getArea());
        }
        
        int demTron = 0, demTru = 0;
        for (Circle s : shapes) {
            if (s instanceof Cylinder) demTru++;
            else if (s instanceof Circle) demTron++;
        }
        System.out.println("So hinh tron: " + demTron);
        System.out.println("So hinh tru: " + demTru);
        
        double tongTT = 0;
        for (Circle s : shapes) {
            if (s instanceof Cylinder cylinder) {
                tongTT += cylinder.getVolume();
            }
        }
        System.out.printf("Tong the tich cac hinh tru: %.2f", tongTT);
    }
}
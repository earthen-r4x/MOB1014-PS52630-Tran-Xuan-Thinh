package com.fpoly.lab6;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
        else System.out.println("Chieu cao khong hop le");
    }
    
    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height
                + 2 * Math.PI * super.getRadius() * super.getRadius(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public double getVolume() {
        return super.getArea() * height;
    }
    
    @Override
    public String toString() {
        return String.format("Hinh tru [ban kinh=%.2f, mau=%s, chieu cao=%.2f, dien tich toan phan=%.2f, the tich=%.2f]",
                super.getRadius(), super.getColor(), this.height, this.getArea(), getVolume());
    }
    
}

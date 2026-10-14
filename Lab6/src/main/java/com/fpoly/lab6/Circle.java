package com.fpoly.lab6;

public class Circle {
    protected double radius;
    protected String color;

    // Constructor
    public Circle() {
        radius = 1.0;
        color = "Trang";
    }
    
    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setter
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else System.out.println("Ban kinh khong hop le");
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Void
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Hinh tron [ban kinh=%.2f, mau=%s, chu vi=%.2f, dien tich=%.2f]",
                radius, color, getPerimeter(), getArea()
        );
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab5;
import java.util.Scanner;
/**
 *
 * @author tranx
 */
public class Laptop {
//    init
    private String id;
    private String name;
    private String type;
    private double price;
    private int quantity;

//    Constructor
    public Laptop() {
    }

    public Laptop(String id, String name, String type, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.setPrice(price);
        this.setQuantity(quantity);
    }

//    Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

//    Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Gia khong hop le");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
        else {
            System.out.println("So luong khong hop le");
        }
    }
    
//    function
    public void input(Scanner sc) {
        System.out.printf("Nhap id san pham: ");
        this.id = sc.nextLine();
        System.out.printf("Nhap ten san pham: ");
        this.name = sc.nextLine();
        System.out.printf("Nhap loai san pham: ");
        this.type = sc.nextLine();
        System.out.printf("Nhap gia: ");
        this.price = sc.nextDouble();
        System.out.printf("Nhap so luong: ");
        this.quantity = sc.nextInt();
        sc.nextLine();
    }
    
    public void output() {
        System.out.printf("ID: %-4s | Ten: %-20s | Loai: %-10s | Gia: %-8.0f | SL: %-2d\n",
                this.id, this.name, this.type, this.price, this.quantity);
    }
}

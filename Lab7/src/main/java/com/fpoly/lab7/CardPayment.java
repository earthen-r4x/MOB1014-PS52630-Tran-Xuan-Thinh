/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author tranx
 */
public class CardPayment implements Payment {
    
    @Override
    public double pay(double amount) {
        double sauGiamGia = amount * 0.95;
        return sauGiamGia + sauGiamGia * TAX;
    }
}

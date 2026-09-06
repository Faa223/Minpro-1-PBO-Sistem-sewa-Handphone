/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsewahandphone;

/**
 *
 * @author ASUS
 */
public class Sewa {
    String idSewa, idPelanggan, kodeHP;
    int hari;

    public Sewa(String idSewa, String idPelanggan, String kodeHP, int hari) {
        this.idSewa = idSewa;
        this.idPelanggan = idPelanggan;
        this.kodeHP = kodeHP;
        this.hari = hari;
    }
}
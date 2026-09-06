/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemsewahandphone;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Handphone> hp = new ArrayList<>();
        ArrayList<Pelanggan> pelanggan = new ArrayList<>();
        ArrayList<Sewa> sewa = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM SEWA HANDPHONE ===");
            System.out.println("1. Handphone");
            System.out.println("2. Pelanggan");
            System.out.println("3. Sewa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                    
                // HANDPHONE
                case 1:

                    int menuHP;

                    do {
                        System.out.println("\n=== DATA HANDPHONE ===");
                        System.out.println("1. Tambah Handphone");
                        System.out.println("2. Lihat Handphone");
                        System.out.println("3. Ubah Handphone");
                        System.out.println("4. Hapus Handphone");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        menuHP = input.nextInt();
                        input.nextLine();

                        switch (menuHP) {

                            // CREATE
                            case 1:
                                System.out.print("Kode HP: ");
                                String kode = input.nextLine();

                                System.out.print("Merk: ");
                                String merk = input.nextLine();

                                System.out.print("Tipe: ");
                                String tipe = input.nextLine();

                                System.out.print("Harga Sewa: ");
                                double harga = input.nextDouble();
                                input.nextLine();

                                hp.add(new Handphone(kode, merk, tipe, harga));

                                System.out.println("Handphone sudah ditambahkan");
                                break;

                            // READ
                            case 2:
                                if (hp.isEmpty()) {
                                    System.out.println("Belum ada data tersedia");
                                } else {
                                    System.out.println("\n=== DAFTAR HANDPHONE ===");

                                    for (int i = 0; i < hp.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + hp.get(i).kode + " | "
                                            + hp.get(i).merk + " | "
                                            + hp.get(i).tipe + " | Rp"
                                            + hp.get(i).harga
                                        );
                                    }
                                }
                                break;

                            // UPDATE
                            case 3:
                                if (hp.isEmpty()) {
                                    System.out.println("Belum ada data handphone");
                                } else {

                                    for (int i = 0; i < hp.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + hp.get(i).kode + " | "
                                            + hp.get(i).merk + " | "
                                            + hp.get(i).tipe
                                        );
                                    }

                                    System.out.print("Pilih nomor HP yang mau diubah: ");
                                    int nomor = input.nextInt();
                                    input.nextLine();

                                    if (nomor >= 1 && nomor <= hp.size()) {

                                        System.out.print("Merk baru: ");
                                        hp.get(nomor - 1).merk = input.nextLine();

                                        System.out.print("Tipe baru: ");
                                        hp.get(nomor - 1).tipe = input.nextLine();

                                        System.out.print("Harga baru: ");
                                        hp.get(nomor - 1).harga = input.nextDouble();
                                        input.nextLine();

                                        System.out.println("Data berhasil diubah");

                                    } else {
                                        System.out.println("Nomor tidak tersedia");
                                    }
                                }
                                break;

                            // DELETE
                            case 4:
                                if (hp.isEmpty()) {
                                    System.out.println("Belum ada data handphone");
                                } else {

                                    for (int i = 0; i < hp.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + hp.get(i).kode + " | "
                                            + hp.get(i).merk
                                        );
                                    }

                                    System.out.print("Pilih nomor HP yang ingin dihapus: ");
                                    int nomor = input.nextInt();
                                    input.nextLine();

                                    if (nomor >= 1 && nomor <= hp.size()) {

                                        hp.remove(nomor - 1);

                                        System.out.println("Data berhasil dihapus!");

                                    } else {
                                        System.out.println("Nomor tidak tersedia");
                                    }
                                }
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Pilihan tidak tersedia");
                        }

                    } while (menuHP != 0);

                    break;

                // PELANGGAN
                case 2:

                    int menuPelanggan;

                    do {
                        System.out.println("\n=== DATA PELANGGAN ===");
                        System.out.println("1. Tambah Pelanggan");
                        System.out.println("2. Lihat Pelanggan");
                        System.out.println("3. Ubah Pelanggan");
                        System.out.println("4. Hapus Pelanggan");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        menuPelanggan = input.nextInt();
                        input.nextLine();

                        switch (menuPelanggan) {

                            // CREATE
                            case 1:
                                System.out.print("ID Pelanggan: ");
                                String id = input.nextLine();

                                System.out.print("Nama: ");
                                String nama = input.nextLine();

                                System.out.print("No HP: ");
                                String noHP = input.nextLine();

                                pelanggan.add(new Pelanggan(id, nama, noHP));

                                System.out.println("Pelanggan berhasil ditambahkan!");
                                break;

                            // READ
                            case 2:
                                if (pelanggan.isEmpty()) {
                                    System.out.println("Belum ada data pelanggan.");
                                } else {

                                    System.out.println("\n=== DAFTAR PELANGGAN ===");

                                    for (int i = 0; i < pelanggan.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + pelanggan.get(i).id + " | "
                                            + pelanggan.get(i).nama + " | "
                                            + pelanggan.get(i).noHP
                                        );
                                    }
                                }
                                break;

                            // UPDATE
                            case 3:
                                if (pelanggan.isEmpty()) {
                                    System.out.println("Belum ada data pelanggan");
                                } else {

                                    for (int i = 0; i < pelanggan.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + pelanggan.get(i).id + " | "
                                            + pelanggan.get(i).nama
                                        );
                                    }

                                    System.out.print("Pilih nomor pelanggan yang ingin diubah: ");
                                    int nomor = input.nextInt();
                                    input.nextLine();

                                    if (nomor >= 1 && nomor <= pelanggan.size()) {

                                        System.out.print("Nama baru: ");
                                        pelanggan.get(nomor - 1).nama = input.nextLine();

                                        System.out.print("No HP baru: ");
                                        pelanggan.get(nomor - 1).noHP = input.nextLine();

                                        System.out.println("Data berhasil diubah!");

                                    } else {
                                        System.out.println("Nomor tidak tersedia");
                                    }
                                }
                                break;

                            // DELETE
                            case 4:
                                if (pelanggan.isEmpty()) {
                                    System.out.println("Belum ada data pelanggan");
                                } else {

                                    for (int i = 0; i < pelanggan.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + pelanggan.get(i).id + " | "
                                            + pelanggan.get(i).nama
                                        );
                                    }

                                    System.out.print("Pilih nomor pelanggan yang ingin dihapus: ");
                                    int nomor = input.nextInt();
                                    input.nextLine();

                                    if (nomor >= 1 && nomor <= pelanggan.size()) {

                                        pelanggan.remove(nomor - 1);

                                        System.out.println("Data berhasil dihapus!");

                                    } else {
                                        System.out.println("Nomor tidak tersedia");
                                    }
                                }
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Pilihan tidak tersedia");
                        }

                    } while (menuPelanggan != 0);

                    break;

                // SEWA
                case 3:

                    int menuSewa;

                    do {
                        System.out.println("\n=== DATA SEWA ===");
                        System.out.println("1. Tambah Sewa");
                        System.out.println("2. Lihat Sewa");
                        System.out.println("3. Ubah Sewa");
                        System.out.println("4. Hapus Sewa");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        menuSewa = input.nextInt();
                        input.nextLine();

                        switch (menuSewa) {

                            // CREATE
                            case 1:
                                System.out.print("ID Sewa: ");
                                String idSewa = input.nextLine();

                                System.out.print("ID Pelanggan: ");
                                String idPelanggan = input.nextLine();

                                System.out.print("Kode HP: ");
                                String kodeHP = input.nextLine();

                                System.out.print("Lama Sewa: ");
                                int hari = input.nextInt();
                                input.nextLine();

                                sewa.add(
                                    new Sewa(
                                        idSewa,
                                        idPelanggan,
                                        kodeHP,
                                        hari
                                    )
                                );

                                System.out.println("Data sewa berhasil ditambahkan!");
                                break;

                            // READ
                            case 2:
                                if (sewa.isEmpty()) {
                                    System.out.println("Belum ada data sewa.");
                                } else {

                                    System.out.println("\n=== DAFTAR SEWA ===");

                                    for (int i = 0; i < sewa.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + sewa.get(i).idSewa + " | "
                                            + sewa.get(i).idPelanggan + " | "
                                            + sewa.get(i).kodeHP + " | "
                                            + sewa.get(i).hari + " hari"
                                        );
                                    }
                                }
                                break;

                            // UPDATE
                            case 3:
                                if (sewa.isEmpty()) {
                                    System.out.println("Belum ada data sewa");
                                } else {

                                    for (int i = 0; i < sewa.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + sewa.get(i).idSewa + " | "
                                            + sewa.get(i).kodeHP + " | "
                                            + sewa.get(i).hari + " hari"
                                        );
                                    }

                                    System.out.print("Pilih nomor sewa yang ingin diubah: ");
                                    int nomor = input.nextInt();
                                    input.nextLine();

                                    if (nomor >= 1 && nomor <= sewa.size()) {

                                        System.out.print("Lama sewa baru: ");
                                        sewa.get(nomor - 1).hari = input.nextInt();
                                        input.nextLine();

                                        System.out.println("Data berhasil diubah!");

                                    } else {
                                        System.out.println("Nomor tidak tersedia.");
                                    }
                                }
                                break;

                            // DELETE
                            case 4:
                                if (sewa.isEmpty()) {
                                    System.out.println("Belum ada data sewa");
                                } else {

                                    for (int i = 0; i < sewa.size(); i++) {
                                        System.out.println(
                                            (i + 1) + ". "
                                            + sewa.get(i).idSewa + " | "
                                            + sewa.get(i).kodeHP
                                        );
                                    }

                                    System.out.print("Pilih nomor sewa yang ingin dihapus: ");
                                    int nomor = input.nextInt();
                                    input.nextLine();

                                    if (nomor >= 1 && nomor <= sewa.size()) {

                                        sewa.remove(nomor - 1);

                                        System.out.println("Data berhasil dihapus!");

                                    } else {
                                        System.out.println("Nomor tidak tersedia");
                                    }
                                }
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Pilihan tidak tersedia");
                        }

                    } while (menuSewa != 0);

                    break;

                // selesai
                    
                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia");
            }

        } while (pilihan != 0);

        input.close();
    }
}

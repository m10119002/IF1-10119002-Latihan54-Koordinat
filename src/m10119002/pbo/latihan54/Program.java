/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan54;

import m10119002.pbo.latihan54.target.WarnaKoordinat;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program koordinat
 * Pertemuan 5
 * 
 */
public class Program {
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : ".
                concat(wk.getNamaWarna()));
        System.out.println("Koordinat Sumbu x : ".
                concat(Integer.toString(wk.getX())).
                concat(", y : ").
                concat(Integer.toString(wk.getY())));
    }
}

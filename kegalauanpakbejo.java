/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauanpakbejo;

/**
 *
 * @author Ikhsan
 */
public class kegalauanpakbejo {
       public static void main(String[] args) {
           Keramik a = new Keramik();
           System.out.println("Keramik A");
           a.ukuran1 = (float)0.3;
           a.ukuran2 = (float)0.3;
           a.box = 10;
           a.hargaBox = 54000;
           a.perhitunganHarga();
           System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           
           System.out.println("Keramik B");
           a.ukuran1 = (float)0.4;
           a.ukuran2 = (float)0.4;
           a.box = 5;
           a.hargaBox = 65000;
           a.perhitunganHarga();
           System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           
           System.out.println("Keramik C");
           a.ukuran1 = (float)0.3;
           a.ukuran2 = (float)0.4;
           a.box = 8;
           a.hargaBox = 60000;
           a.perhitunganHarga();
           System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           
    }
 }

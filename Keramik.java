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
public class Keramik {
    float ukuran1;
    float ukuran2;
    int box;
    int hargaBox;
    
void perhitunganHarga(){
    float total;
    float harga;
    total = this.box*this.ukuran1*this.ukuran2;
    harga=100/total*this.hargaBox;
    System.out.println("harga total nya adalah "+harga);
    }   
}
  
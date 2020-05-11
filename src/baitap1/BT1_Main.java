/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BT1_Main {
    public static void main(String[] args) {
        HoaDonHeader hoadon = new HoaDonHeader.Builder()
            .addMHD("HD004")
            .addNgBan("5/5/2020")
            .addTenKH("Nguyen Nam Duong")
            .build();
    
        System.out.println(hoadon.toString());
        
        CTHD CT1 = new CTHD.Builder()
            .addSP("iphone X")
            .addSL("1")
            .addDonGia("8000000")
            .addChietKhau("90%")
            .build();
             
        CTHD CT2 = new CTHD.Builder()
            .addSP("iphone 5")
            .addSL("1")
            .addDonGia("5000000")
            .addChietKhau("95%")
            .build();


        ArrayList CT = new ArrayList<>();
            CT.add(CT1);
            CT.add(CT2);
        
        System.out.println(CT.toString()+"\n\n");
    }
}

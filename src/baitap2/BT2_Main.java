/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author DELL
 */
public class BT2_Main {
    public static void main(String[] args) {
        MyStringBuilder chuoi = new MyStringBuilder.StringBuilder()
            .addStr("Nguyen Nam Duong ")
            .addS("59CNTT2 ")
            .addF(15.5f)
            .addB(true)
            .build();
    
        System.out.println(chuoi.toString());
    }
}

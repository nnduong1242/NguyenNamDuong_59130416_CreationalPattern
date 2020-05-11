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
public class CTHD {
    String SP, SL, donGia, chietKhau;
    ArrayList<CTHD> dsCTHD = new ArrayList<>();

    public ArrayList<CTHD> getDsCTHD() {
        return dsCTHD;
    }

    protected CTHD(Builder builder) {
        this.dsCTHD = builder.dsCTHD;
        this.SP = builder.SP;
        this.SL = builder.SL;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() {
        return "\n\nSP=" + SP + "\nSL=" + SL + "\ndonGia=" + donGia + "\nchietKhau=" + chietKhau;
    }
    
    public static class Builder{
        String SP, SL, donGia, chietKhau;
        ArrayList<CTHD> dsCTHD = new ArrayList<>();
        
        
        public Builder(){
            
        }
        
        public Builder addSP(String SP){
            this.SP=SP;
            return this;
        }
        public Builder addSL(String SL){
            this.SL=SL;
            return this;
        }
        public Builder addDonGia(String donGia){
            this.donGia=donGia;
            return this;
        }
        
        public Builder addChietKhau(String chietKhau){
            this.chietKhau=chietKhau;
            return this;
        } 
        
        public CTHD build(){
            return new CTHD(this);
        }
    }
}

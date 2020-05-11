/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author DELL
 */
public class HoaDonHeader {
    String MHD, ngBan, tenKH;

    protected HoaDonHeader(Builder builder) {
        this.MHD = builder.MHD;
        this.ngBan = builder.ngBan;
        this.tenKH = builder.tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader: \n" + "MHD=" + MHD + "\nngBan=" + ngBan + "\ntenKH=" + tenKH;
    }
    
    
    
    public static class Builder{
        String MHD, ngBan, tenKH;

        public Builder(){
            
        }
        
        public Builder addMHD(String MHD){
            this.MHD=MHD;
            return this;
        }
        public Builder addNgBan(String ngBan){
            this.ngBan=ngBan;
            return this;
        }
        public Builder addTenKH(String tenKH){
            this.tenKH=tenKH;
            return this;
        }
        
        public HoaDonHeader build(){
            return new HoaDonHeader(this);
        }
    }
}

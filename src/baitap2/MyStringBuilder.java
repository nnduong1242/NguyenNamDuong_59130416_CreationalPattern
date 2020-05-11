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
public class MyStringBuilder {
    String str,s;
    Float f;
    Boolean b;

    protected MyStringBuilder(StringBuilder builder) {
        this.str = builder.str;
        this.s = builder.s;
        this.f = builder.f;
        this.b = builder.b;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + ", s=" + s + ", f=" + f + ", b=" + b + '}';
    }

    public static class StringBuilder{
        String str,s;
        Float f;
        Boolean b;

        public StringBuilder(){
            
        }
        
        public StringBuilder addStr(String str){
            this.str=str;
            return this;
        }
        public StringBuilder addS(String s){
            this.s=s;
            return this;
        }
        public StringBuilder addF(Float f){
            this.f=f;
            return this;
        }
        public StringBuilder addB(Boolean b){
            this.b=b;
            return this;
        }
        
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}

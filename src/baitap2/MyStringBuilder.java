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
        return "str=" + str;
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
            this.str = str.concat(s);
            return this;
        }
        public StringBuilder addF(Float f){
            this.str=str.concat(f.toString());
            return this;
        }
        public StringBuilder addB(Boolean b){
            this.str=str.concat(b.toString());
            return this;
        }
        
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}


package com.mycompany.laboratorio_2_poo;

public class Fecha {
   private int dd;
   private int mm;
   private int aa;
   public Fecha(){
   };
   public Fecha(int dd, int mm, int aa){
   this.dd = dd;
   this.mm = mm;
   this.aa = aa;
   };
   public int getDia(){return dd;};
   public int getMes(){return mm;};
   public int getA(){return aa;};
   public void setDia(int dd){this.dd = dd;};
   public void setMes(int mm){this.mm = mm;};
   public void setA(int aa){this.aa = aa;};
   public String toString(){return dd + "-" + mm + "-" + aa;};
} 

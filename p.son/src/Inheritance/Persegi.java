
package Inheritance;

import Inheritance.BangunDatar;

public class Persegi extends BangunDatar{  
    float sisi;

    @Override
    float luas(){
        float luas=sisi*sisi;
        System.out.println("luas persegi :"+luas);
        return luas;
    }
    @Override
   float keliling(){
       float keliling=4*sisi;
       System.out.println("keliling persegi yaitu: " + keliling);
       return keliling;
   }
  
    }


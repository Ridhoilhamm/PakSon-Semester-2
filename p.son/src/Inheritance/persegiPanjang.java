
package Inheritance;

import Inheritance.BangunDatar;


public class persegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
    
    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("luas persegi panjang yaitu: "+ luas );
        return luas;
    }
   
    @Override
    float keliling(){
        float keliling= 2*(panjang+ lebar);
        System.out.println("Keliling persegi yaitu: "  + keliling);
        return keliling;
    }
  
}


package Inheritance;

import Inheritance.BangunDatar;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
  
    @Override
    float luas(){
        float luas= 2*alas*tinggi;
        System.out.println("luas segitiga yaitu: "+luas);
        return luas;
}
}

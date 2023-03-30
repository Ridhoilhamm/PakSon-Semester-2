
package Inheritance;

import Inheritance.BangunDatar;


public class lingkaran extends BangunDatar{
    float r;
    float phi;
     @Override
    float luas(){
        float luas=2*phi*r*r;
        System.out.println("luas lingkaran: "+luas);
        return luas;
    }
    }
   

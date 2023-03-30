
package Inheritance;

import Inheritance.persegiPanjang;
import Inheritance.lingkaran;
import Inheritance.Segitiga;
import Inheritance.Persegi;
import Inheritance.BangunDatar;

public class main {
    public static void main(String[] args) {
        BangunDatar ridho = new BangunDatar();
        Persegi persegi = new Persegi();
        persegi.sisi=2;
        
        lingkaran Lingkaran= new lingkaran();
        Lingkaran.r=14;
        Lingkaran.phi=22/7;
        
        persegiPanjang mpersegiPanjang = new persegiPanjang();
        mpersegiPanjang.lebar=10;
       mpersegiPanjang.panjang=20;
        
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas=12;
        mSegitiga.tinggi=10;
  
        ridho.luas();
        ridho.keliling();
        
        mSegitiga.keliling();
        mSegitiga.luas();
        
        mpersegiPanjang.keliling();
        mpersegiPanjang.luas();
        
        Lingkaran.keliling();
        Lingkaran.luas();
      
        persegi.luas();
        persegi.keliling();
         

    }
}

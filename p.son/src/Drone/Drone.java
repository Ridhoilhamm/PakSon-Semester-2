package Drone;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String Merek;
    
    void terbang(){
        energi --;
        if(energi >10){
            ketinggian++;
            System.out.println("Drone Terbang");
            
        }else{
            System.out.println("Drone nggak bisa terbang");
        }
    }
    
    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("Mesin bisa dimatikan");
        }
    }
    
    void turun (){
        ketinggian --;
        energi--;
        System.out.println("Drone turun");
    }
    
    void belok(){
    energi--;
        System.out.println("Drone belok");
        
}
    void maju(){
    energi--;
        System.out.println("Drone maju kedepan");
        kecepatan--;
    
}
void mundur(){
    energi--;
    System.out.println("Drone Mundur kedepan");
    kecepatan++;
}
void run(){
    System.out.println("terbang+ belok");
    System.out.println("energi + energi");
}

//    public static void main(String[] args) {
//        Scanner inputan= new Scanner(System.in);
//        Drone ridho = Drone;
    }




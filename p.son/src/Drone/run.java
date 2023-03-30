package Drone;


import Drone.Drone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class run {
    public static void main(String[] args) {
        Drone ridho =new Drone();
        ridho.energi=6;
        ridho.kecepatan=40;
        ridho.ketinggian=30;
        ridho.Merek="klambi";
        
        
      ridho.terbang();
      ridho.matikanMesin();
      ridho.belok();
      ridho.maju();
      ridho.turun();
        
    }
}

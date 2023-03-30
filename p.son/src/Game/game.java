package Game;


import Game.Player;


public class game {
    public static void main(String[] args) {
        //membuat objek player
        Player ridho = new Player();
        
        // mengisi atribut player
        ridho.nama=" ridho";
        ridho.speed = 100;
        ridho.healthPoint = 100;
      
        //  menjalankan method
         ridho.run();
        
        if(ridho.isDead()){
            System.out.println(" Game Over");
           
    }
}
}
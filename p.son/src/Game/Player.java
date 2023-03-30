package Game;


public class Player {
    //definisi  atribut
    String nama;
    int speed;
    int healthPoint;
    
    //definisi method run
    void run(){
        System.out.println(nama+" is running...");
        System.out.println(" Speed"+speed);
        
      // definisi method is dead untuk mengecek hp  
    }
    boolean isDead(){
     if (healthPoint <=0) return true;
     return false;
            }
}

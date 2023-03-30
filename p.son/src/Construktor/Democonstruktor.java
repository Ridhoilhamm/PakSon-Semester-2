
package Construktor;

 public class Democonstruktor {
     
     public String username;
     public String pasword;
    
     public Democonstruktor(String username,String pasword){
     this.username = username;
     this.pasword = pasword;
     
     }
             }
     
    class Run{
        public static void main(String[] args) {
        Democonstruktor ridho = new Democonstruktor("ridho","ridhi");
        System.out.println("username: "+ridho.username);
        System.out.println("Password: "+ridho.pasword);
    }
  }

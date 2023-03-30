package GetterSetter;

public class Main {
      public static void main(String[] args) {
        user ridho = new user();
       
        //Menggunakan method Setter
        ridho.setUsername("ridho");
        ridho.setPassword("ridho2");
        
        // menggunakan method gether
        System.out.println("Username: "+ ridho.getUsername());
        System.out.println("Password: "+ ridho.getPassword());
    }
}
    


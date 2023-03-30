package Interface;


import Interface.InterfaceNotification;


public class PusshNotification implements InterfaceNotification {
    public void CallMassage(String receiver,String content){
         System.out.println("Mengiriimkan ke " + receiver + " dengan isi");
        System.out.println(content);
    }
}

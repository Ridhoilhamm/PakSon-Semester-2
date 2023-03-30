package Interface;


import Interface.InterfaceNotification;


 
public class SmsNotification implements InterfaceNotification{
 @Override
 public void CallMassage(String receiver,String content){
     System.out.println("Mengiriimkan ke "+receiver+"dengan isi");
     System.out.println(content);
 }    
}

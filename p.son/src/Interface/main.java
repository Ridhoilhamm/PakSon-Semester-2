package Interface;


import Interface.SmsNotification;
import Interface.PusshNotification;
import Interface.EmailNotification;


public class main {
    public static void main(String[] args) {
        String emailPenerima ="ridhoSubekti29@gmail.com";
        String noHp="08970915625";
        String MobileId="Android";
     
        EmailNotification emailNotif=new EmailNotification();
        SmsNotification smsNotif =new SmsNotification();
        PusshNotification pusshNotif= new PusshNotification();
        
        String Message="Hallo";
        
        emailNotif.CallMassage(emailPenerima,Message);
        smsNotif.CallMassage(noHp,Message);
        pusshNotif.CallMassage(MobileId, Message);
        
    }
}

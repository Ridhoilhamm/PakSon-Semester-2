package TokoOnline;


import TokoOnline.User;
import java.util.ArrayList;


public class Member implements User{
private ArrayList<String> namaMember =new ArrayList<String>();
private ArrayList<String> alamat =new ArrayList<String>();
private ArrayList<String> telepon =new ArrayList<String>();
private ArrayList<Integer> saldo =new ArrayList<Integer>();

public Member (){
    this.namaMember.add("Ridho");
    this.alamat.add("Jombang");
    this.telepon.add("0988878");
    this.saldo.add(100000);
    
     this.namaMember.add("Akbar");
    this.alamat.add("Malang City");
    this.telepon.add("0988878");
    this.saldo.add(200000);
}

public void Setsaldo(int saldo){
 this.saldo.add(saldo);
 
}

public int getsaldo(int idMember){
    return this.saldo.get(idMember);
    
}
public void ediSaldo(int idMember,int saldo){
    this.saldo.set(idMember,saldo);;
    
}
public int getJamMember(){
    return this.saldo.size();
}

public void SetNama(String nama){
    
}

    @Override
    public void setNama(String namaMember) {
       this.namaMember.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
    this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
       this.telepon.add(telepon);
      
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
    return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
     return this.telepon.get(idMember);
    }
}

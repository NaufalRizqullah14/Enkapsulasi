package enkapsulasi;

public class Enkapsulasi {

    public static void main(String[] args) {
     user Nichol = new user("Nichol","anak.sholeh",0);

Nichol.setUsername("Nichol");
Nichol.setPassword("anak.sholeh");
Nichol.getId();
Nichol.setStatus(true);

System.out.println("Username: " + Nichol.getUsername());
System.out.println("Password: " + Nichol.getPassword()); 
System.out.println("id: " + Nichol.getId());
System.out.println("status: " + Nichol.isStatus());  
    }
    
}

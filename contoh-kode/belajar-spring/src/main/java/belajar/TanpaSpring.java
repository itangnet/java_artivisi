package belajar;

public class TanpaSpring {
    public static void main(String[] args) {
        KoneksiDatabase k = new KoneksiDatabase();
        
        k.setHost("localhost");
        k.setNamaDatabase("belajar");
        k.setUsername("root");
        k.setPassword("coba");
        
        System.out.println("Host : "+k.getHost());
        System.out.println("Nama DB : "+k.getNamaDatabase());
        System.out.println("Username : "+k.getUsername());
        System.out.println("Password : "+k.getPassword());
    }
}


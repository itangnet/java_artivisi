package belajar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DenganSpring {
    public static void main(String[] args) {
        ApplicationContext aplikasiSpring 
                = new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");
        KoneksiDatabase k = (KoneksiDatabase) aplikasiSpring.getBean("kd");
        
        System.out.println("Host : "+k.getHost());
        System.out.println("Nama DB : "+k.getNamaDatabase());
        System.out.println("Username : "+k.getUsername());
        System.out.println("Password : "+k.getPassword());

        CustomerDao cd = (CustomerDao) aplikasiSpring.getBean("cd");

        Customer c = new Customer();
        cd.hapus(c);

    }
}

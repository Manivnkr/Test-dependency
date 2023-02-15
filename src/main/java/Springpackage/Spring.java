package Springpackage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Spring {

    public static void main(String[] args) {
        SpringApplication.run(Spring.class, args);
        System.out.println("Spring booot application");
    }

}

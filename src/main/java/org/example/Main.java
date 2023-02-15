package org.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws SQLException {
        Employee newemployee = new Employee();
        Employer newemployer = new Employer();
        newemployee.firstname.add("manikantha");
        newemployee.firstname.add("Kumar");
        newemployee.lastname.add("kothamasu");
        newemployee.lastname.add("Gudivada");
        String newemployeefsname;
        String newemployeelsname;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<=10;i++){

         newemployeefsname = scan.next();
         newemployeelsname = scan.next();
         String z = newemployee.addition(newemployeefsname , newemployeelsname);
            System.out.println(z);
        }

        Consumer scanning = (n)->{
            String fullname;
            String firstName = "mani";
            String lastName = "kanta";
            fullname = firstName+lastName;
        };
        System.out.println("lambada starts");




        Consumer<String> print = (n) -> {System.out.println(n);};

        newemployee.fullname.forEach(print);


    }
}
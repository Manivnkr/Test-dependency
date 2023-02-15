package org.example;

import java.util.ArrayList;

public class Employee {

     ArrayList<String> firstname= new ArrayList<>();
     ArrayList<String> lastname= new ArrayList<>();
     ArrayList<String> fullname= new ArrayList<>();

     public  String addition(String firstname, String lastname){

          String fullname1 = firstname + lastname;
          this.fullname.add(fullname1);
          return fullname1;

     }


}

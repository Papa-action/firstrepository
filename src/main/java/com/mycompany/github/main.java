/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.github;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
                Scanner input = new Scanner (System.in);
        GitHub checker = new GitHub();
        String firstName = "Yonela";
        String LastName = "Nuba";
        
        System.out.println("enter username");
        String Name = input.next();
        
        // if checkUsername conditions are not met it will repromt the user to re-enter Name
        while(!(checker.checkUserName(Name))){
        System.out.println("username must containe an underscore and is no more than 5 characters long ");
        System.out.println("enter username");
        Name = input.next(); 
        }
        System.out.println("Welcome"+" "+ firstName+" "+ LastName + ",it is great to see you");
        
        
        System.out.println("enter password");
        String password = input.next();
        
        // if checkPasswordComplexity conditions are not met it will repromt the user to re-enter paasword
        while(!(checker.checkPasswordComplexity(password))){
        System.out.println("Password is not correctly formatted,"
                + "please ensure that the password contains atleast 8 characters,"
                + "a capital letter, a number and a special character ");
        
        System.out.println("enter password");
        password = input.next();
        }
        System.out.println("Password succesfully captured");

        checker.registerUser(Name,password);
        
        System.out.println("enter created username");
        String createUsername = input.next();
        System.out.println("enter created password");
        String createPassword = input.next();
        
        // if loginUser conditions are not met it will repromt the user to re-enter username or password
        while(!(checker.loginUser(createPassword, createUsername, password, Name))){
        System.out.println("Username or Password incorrect");
        System.out.println("enter created username");
        createUsername = input.next();

        System.out.println("enter created password");
        createPassword = input.next();
        }
        System.out.println(checker.returnLoginStatus(createPassword, createUsername, Name, password));
   
    }   
}

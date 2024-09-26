/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.github;

/**
 *
 * @author User
 */
public class GitHub {

            boolean checkUserName(String Name){
         if (Name == null) {
            return false; // Return false if username does not contain an underscore and more than 5 characters long
        }
        //Reurn true if Name contains undersore and is no more than 5 characters long  
        return Name.contains("_")&& Name.length()<=5; 
    }  

            boolean checkPasswordComplexity(String password){
         if (password == null) {
            return false; // Return false if the password does not meet the conditions
        }
        // Return true if password contains atleast 8 characters,a capital letter, a number and a special character 
        return password.length()>=8&& password.matches(".*[A-Z].*")&& password.matches(".*\\d.*")
                && password.contains("@")
                || password.contains("!")                
                || password.contains("#") 
                || password.contains("%")
                || password.contains("$")
                || password.contains("&")
                || password.contains("*")
                || password.contains("?");
    }





}

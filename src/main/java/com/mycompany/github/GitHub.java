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

        //this method will return true if checkPasswordComplexity and checkUserName both return true 
        public void registerUser(String Name ,String password){ 
                if(checkUserName(Name)&&checkPasswordComplexity(password)){
                    System.out.println("Username and Password correctly formatted");
                }else{
                    System.out.println("The username is incorrectlty formatted or"
                            + "The password does not meet complexity requirements");
                }
            }

        
        //this method will return true if username and password are re-entered correctly
        boolean loginUser(String createPassword, String createUsername, String password, String Name){
            
        return createPassword.equals(password) && createUsername.equals(Name);   
        }
        
        
       // this method will return login status if loginUser returns true 
       public String returnLoginStatus(String createPassword, String createUsername, String Name ,String password){
            
           if (loginUser(createPassword,createUsername, password, Name)){
                return "Successful login";
            }else{
                return "Failed login";
            }

       }



}

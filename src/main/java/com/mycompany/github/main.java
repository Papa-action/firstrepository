/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.github;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
                Scanner input = new Scanner (System.in);
        Login checker = new Login();
        String firstName = "Yonela";
        String LastName = "Nuba";
        String name ="";
        String lastName="";
        String taskName="";
        String taskDescription="";
        int a;
        int b = 0;
        String num1;
        int taskNumber = -1;
        int hours = 0;
        int addhours = 0 ;
        

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
   
         Task currentTask = new Task(name, lastName, taskName, taskDescription);      
       
        String welcome = "Welcome to EasyKanban";
        
        JOptionPane.showMessageDialog(null, welcome);
        
        

        while (true) {
            
            String choicestr = JOptionPane.showInputDialog(null,
                    "1. Add task\n"
                    + "2. Show report\n"
                    + "3. Quit"
            );

            
            int choice = Integer.parseInt(choicestr);

            
            switch (choice) {
                case 1:
                    
                    JOptionPane.showMessageDialog(null, "You selected: Add task");

                    
                    num1 = JOptionPane.showInputDialog(null, "Select the number of tasks to be added:");
                    a = Integer.parseInt(num1);

                    
                    while (b < a) {
                        b++;  
                
                        name = JOptionPane.showInputDialog(null, "Enter first name:");
                        lastName = JOptionPane.showInputDialog(null, "Enter last name:");
                        taskName = JOptionPane.showInputDialog(null, "Enter task name:");
                        taskDescription = JOptionPane.showInputDialog(null, "Enter task description:");
                        
                    String c = JOptionPane.showInputDialog(null, "enter duration of task ");
                    addhours = Integer.parseInt(c);
                
                    hours  = hours + addhours;
                        
                        while (!(currentTask.checkTaskDescription(taskDescription ))) {
                            taskDescription = JOptionPane.showInputDialog(null, "Task description must be less than 50 characters long.");
                        }

                        
                        JOptionPane.showMessageDialog(null,
                                currentTask.printTaskDetails(name, lastName, taskName, taskDescription)
                                + "\n " + currentTask.TaskID(taskName, name)
                                +"\n Duration:"+addhours);
                        
                        
                  }  
                       JOptionPane.showMessageDialog(null,"Total hours:" + currentTask.returnTotalHours(hours));
                    
                    
                    break;

                case 2:
                   
                    JOptionPane.showMessageDialog(null, "Coming soon");
                    
                    break;

                case 3:
                    
                    JOptionPane.showMessageDialog(null, "You selected: Quit");
                    System.exit(0);  // Exit the program
                    break;

                default:
                    
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please select 1, 2, or 3.");
                    break;
            }
        

                choicestr = JOptionPane.showInputDialog(null, "Choose an option:\n1. To Do\n2. Doing\n3. Done");

               
                choice = Integer.parseInt(choicestr);

               
                
                

        } 
    
    }   
}

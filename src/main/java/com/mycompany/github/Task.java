/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.github;

/**
 *
 * @author User
 */
public class Task {
    String name;
    String lastName;
    String taskName;
    String taskDescription;
    static int taskNumber = -1;
    
    public Task(String name, String lastName, String taskName, String taskDescription) {
       this.name = name;
        this.lastName = lastName;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskNumber = taskNumber;
    }
    
    public boolean checkTaskDescription(String taskDescription ){
        return taskDescription.length()<50;
    }
    
    public String printTaskDetails(String name, String lastName, String taskName, String taskDescription){

        // Display the user's input along with the current count
        
        return " " + name + " " + lastName + 
               " " + taskName + 
               "\nDescription: " + taskDescription;
    }
    
        String TaskID(String taskName, String name) {
        taskNumber++;  // Increment task number for each new task

        // Get first two letters of taskName, handling case where the name is shorter than 2 characters
        String taskNamePart = taskName.length() >= 2 ? taskName.substring(0, 2) : taskName;

        // Get last three letters of the developer's name, handling case where the name is shorter than 3 characters
        String developerPart = name.length() >= 3 ? name.substring(name.length() - 3) : name;

        // Generate the TaskID in the format: AD:0:INA
        String taskID = (taskNamePart + ":" + taskNumber + ":" + developerPart).toUpperCase();

        return taskID;
       
    }
        
        
public int returnTotalHours(int hours){
   
    return hours;
}
}










/*        LocalDateTime time1, time2;
        int seconds1, seconds2 , difference;
        
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
        
        JOptionPane.showConfirmDialog(null, "is stealing right");
        
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
        
        difference = seconds2 - seconds1;
        
        JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 + 
            "\nStart seconds: " + seconds1 + 
            "\nIt took " + difference + " seconds for you to answer."); */
        
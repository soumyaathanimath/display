/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datimo;

import java.util.Scanner;

/**
 *
 * @author dell1
 */
public class Datimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan=new Scanner(System.in);
         
        System.out.println("Enter a Day number");
        int day=scan.nextInt();
        
        if(day==1)
        {
            System.out.println("Mon");
        }
        else if(day==2)
        {
              System.out.println("Tue");
        }
        else if(day==3)
        {
              System.out.println("Wed");
        }
        else if(day==4)
        {
              System.out.println("Thur");
        }
        else if(day==5)
        {
              System.out.println("Fri");
        }
        else if(day==6)
        {
              System.out.println("Sat");
        }
        else if(day==7)
        {
              System.out.println("Sun");
        }
        else
        {
            System.out.println("Invalid Day Number");
        }
        
    }
    
}

   
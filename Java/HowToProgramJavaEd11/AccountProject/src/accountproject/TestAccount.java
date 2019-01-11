/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountproject;

import java.util.Scanner;

/**
 *
 * @author bisolisp
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
        
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        System.out.print("Please enter a name for your account: ");
        myAccount.setName(input.nextLine());
        System.out.println();
        
        
        System.out.printf("Name in Object myAccount is : %n%s%n", myAccount.getName());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package present101;

import java.util.Scanner;

/**
 *
 * @author phunon
 */
public class runFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("set ticket Machine station:");
        ticketMachine tm=new ticketMachine(new Scanner(System.in).nextInt());
        tm.mainMenu();
    }
    
}

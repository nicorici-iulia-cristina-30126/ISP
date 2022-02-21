
package isp.lab5.exercise1;

import java.util.Scanner;

public class ChangePin extends Transaction{
    //attributes:
    public String oldPin;
    public String newPin;
    
    //constructor:
    public ChangePin(Account acc, String oldPin, String newPin){
        super(acc);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }
    
    //methods:
    @Override
    public String execute() {
        Scanner s1 = new Scanner(System.in);
        while(!oldPin.equals(acc.getCard().getPin())){
            System.out.println("Wrong old pin, try again...");
            System.out.print("Enter your old pin: ");
            oldPin = s1.nextLine();
        }
        while(newPin.length() != 4){
            System.out.println("Wrong new pin, try again...");
            System.out.print("Enter new pin: ");
            newPin = s1.nextLine();
        } 
        return newPin;
    }
    
}

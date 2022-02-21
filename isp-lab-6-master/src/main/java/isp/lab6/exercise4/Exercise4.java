package isp.lab6.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercise4 {

    public static void main(String[] args) {
        System.out.println("Welcome to NewBank ATM!\nPlease enter your card");
        
        //variables:
        int i = 0, amount;
        boolean flag;
        
        //objects:
        Scanner s1 = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        //we have to create 10 id cards for each accounts(the pin will be the same for every account)
        Bank bank = new Bank();
        Card card1 = new Card("1321","12");
        Card card2 = new Card(card1.getPin(),"123");
        Card card3 = new Card(card1.getPin(),"234");
        Card card4 = new Card(card1.getPin(),"345");
        Card card5 = new Card(card1.getPin(),"3456");
        Card card6 = new Card(card1.getPin(),"456");
        Card card7 = new Card(card1.getPin(),"567");
        Card card8 = new Card(card1.getPin(),"890");
        Card card9 = new Card(card1.getPin(),"901");
        Card card10 = new Card(card1.getPin(),"912");
        bank.addAccount(new Account("Iulia", 1233, card1));
        bank.addAccount(new Account("Iulia", 400, card2));
        bank.addAccount(new Account("Iulia", 0, card3));
        bank.addAccount(new Account("Iulia", 20000, card4));
        bank.addAccount(new Account("Iulia", 200, card5));
        bank.addAccount(new Account("Iulia", 121, card6));
        bank.addAccount(new Account("Iulia", 90, card7));
        bank.addAccount(new Account("Iulia", 12, card8));
        bank.addAccount(new Account("Iulia", 87, card9));
        bank.addAccount(new Account("Iulia", 87, card9));
        ATM atm = new ATM(bank); 
        
        //verfy if the user know his pin
        String pin;
        System.out.print("Enter your pin card ");
        pin = s1.nextLine();
        flag = atm.insertCard(card1, pin);// verfy if the user enter the correct pin card
        while(!flag && i < 3){ //the user have 3 chance to enter the correct pin
            System.out.println("Wrong pin, try again...");
            System.out.print("Enter pin: ");
            pin = s1.nextLine();
            flag = atm.insertCard(card1, pin);
            i++;
        }
        if(i == 3){ //if the user did not enter the correct pin, the card will be removed
            atm.removeCard();
        }
        flag = true;
        //the menu for the user:
        while(flag && (atm.getCard() != null)){
            System.out.println("1.Withdraw Money");
            System.out.println("2.Check Money");
            System.out.println("3.Change Pin");
            System.out.println("4.Exit");
            System.out.print("Select...");
            i = s1.nextInt();
            switch(i){
                case 1:{
                    System.out.print("Enter amount:");
                    amount = s1.nextInt();
                    atm.withdraw(amount);
                    break;
                }
                case 2:{
                    atm.checkMoney();
                    break;
                }
                case 3:{
                    String newp;
                    String oldp;
                    System.out.print("Enter your old pin: ");
                    oldp = s.nextLine();
                    System.out.print("Enter new pin: ");
                    newp = s.nextLine();
                    atm.ChangeePin(newp, oldp);
                    System.out.println("You  changed your pin with " + card1.getPin());
                    break;
                }
                case 4:{
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Incorrect numer");
                    break;
                }
            }
        }
    }
}

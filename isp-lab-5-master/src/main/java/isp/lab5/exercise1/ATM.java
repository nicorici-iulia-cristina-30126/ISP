
package isp.lab5.exercise1;

import java.util.Scanner;

public class ATM {
    //attributes:
    private Bank bank;
    private Card card;

    //constructor
    public ATM(Bank bank){
        this.bank = bank;
    }
    
    //methods:
    public Card getCard(){
        return card;
    }
    public boolean insertCard(Card card, String pin) { //verfy if user enter the correct pin
        boolean flag;
        if(pin.equals(card.getPin())){
            this.card = card;
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }
    public void removeCard(){  //remove the crad if the user don't know his pin
        this.card = null;
    }
    public void withdraw(int amount){ 
        String id;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the id of the account you want to withdraw:");
        id = s.nextLine(); //user enter the id to choose with what account he/she wants to withdraw money
        if(bank.getAccountByCardId(id) != null){ //verfy if the id exist
            Transaction t = new WithdrawMoney(bank.getAccountByCardId(id), amount);
            String result = bank.executeTransaction(t);
            if(result == null){
                System.out.println("You withdrew " + amount + "$");
            }
            else{
                System.out.println(result);
            }
        } 
        else{
            System.out.println("Wrong Id");
        }
    }
    public void checkMoney(){
        String id;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the id of the account you want to check the banace:");
        id = s.nextLine();//user enter the id to choose with what account he/she wants to check money
        if(bank.getAccountByCardId(id) != null){ //verfy if the id exist
            Transaction t = new CheckMoney(bank.getAccountByCardId(id));
           System.out.println("You have " + bank.executeTransaction(t) + "$ in your account");  
        }
        else{
            System.out.println("Wrong Id");
        }
    }
    public void ChangeePin(String newP, String oldP){  
        Transaction t = new ChangePin(bank.getAccountByCardId("12"),oldP, newP);
        card.setPin(bank.executeTransaction(t));
    }

}

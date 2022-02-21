
package isp.lab5.exercise1;


public class Account {
    //attributes:
    private String owner;
    private int balance;
    private Card card;
    
    //constructor:
    public Account(String owner, int balance, Card card){
        this.owner = owner;
        this.balance = balance;
        this.card = card;
    }
    
    //methods:
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }
    public Card getCard() {
        return card;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    @Override
    public String toString() {
        return "Account{" + "owner=" + owner + ", balance=" + balance + ", card=" + card + '}';
    }
    
    
}

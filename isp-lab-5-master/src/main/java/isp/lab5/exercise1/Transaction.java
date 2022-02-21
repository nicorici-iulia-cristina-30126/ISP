
package isp.lab5.exercise1;


abstract public class Transaction { 
    public Account acc;
    
    public Transaction(Account account){
        this.acc = account;
    }
    public abstract String execute();
}

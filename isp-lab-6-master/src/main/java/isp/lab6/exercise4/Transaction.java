
package isp.lab6.exercise4;


abstract public class Transaction { 
    public Account acc;
    
    public Transaction(Account account){
        this.acc = account;
    }
    public abstract String execute();
}

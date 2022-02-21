
package isp.lab5.exercise1;


public class CheckMoney extends Transaction{
    
    public CheckMoney(Account acc){
        super(acc);
    }
    
    @Override
    public String execute() {
        int money = acc.getBalance();
        return money + "";
    }
    
}

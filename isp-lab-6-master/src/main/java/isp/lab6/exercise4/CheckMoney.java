
package isp.lab6.exercise4;


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

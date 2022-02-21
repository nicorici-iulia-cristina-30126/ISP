
package isp.lab6.exercise4;


public class WithdrawMoney extends Transaction{
    //attribute:
    public int amount;
    
    //constructor:
    public WithdrawMoney(Account acc, int amount){
        super(acc);
        this.amount = amount;
    }

    @Override
    public String execute() {
        int money = 0;
        String error = null;
        if(amount <= acc.getBalance()){
            switch(amount){
                case 10:{
                    money =  acc.getBalance() - amount;
                    acc.setBalance(money);
                    break;
                }
                case 50:{
                    money =  acc.getBalance() - amount;
                    acc.setBalance(money);
                    break;
                }
                case 100:{
                    money =  acc.getBalance() - amount;
                    acc.setBalance(money);
                    break;
                }
                case 400:{
                    money =  acc.getBalance() - amount;
                    acc.setBalance(money);
                    break;
                }
                default:{
                    error = "You can withdraw 10$ or 50$ or 100$ or 400$";
                    break;
                }
            }
        }
        else{
            error = "You don't have enough money";
        }
        return error;
    }
    
}

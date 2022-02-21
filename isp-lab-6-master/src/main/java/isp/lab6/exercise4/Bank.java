
package isp.lab6.exercise4;

import java.util.ArrayList;
import java.util.List;


public class Bank {
    //attribute:
    private List<Account> accountList = new ArrayList<Account>();
    
    public void addAccount(Account a){
        accountList.add(a);
    }
    
    //methods:
    public String executeTransaction(Transaction t){
       return t.execute();
    }
    public Account getAccountByCardId(String cardId){
        for(Account a: accountList){
            if(a.getCard().getCardId().equals(cardId)){
                return a;
            }
        }
        return null;
    }
    
}

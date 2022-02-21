
package isp.lab5.exercise1;


public class Bank {
    //attributes:
    private Account account[] = new Account[10];
    
    //contructor:
    public Bank(Account[] account){
        this.account[0] = account[0];
        this.account[1] = account[1];
        this.account[2] = account[2];
        this.account[3] = account[3];
        this.account[4] = account[4];
        this.account[5] = account[5];
        this.account[6] = account[6];
        this.account[7] = account[7];
        this.account[8] = account[8];
        this.account[9] = account[9]; 
    }
    
    //methods:
    public String executeTransaction(Transaction t){
       return t.execute();
    }
    public Account getAccountByCardId(String cardId){
        Account a = null;
        for(int i = 0; i < 10; i++){
            if(cardId.equals(account[i].getCard().getCardId())){
                a = account[i];
                break;
            }  
            
        }
        return a;
    }
    
}


package isp.lab5.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AtmTest {
    Card c = new Card("1235", "1234");
    Account[] ac = new Account[10];
    
    @Test
    public void TestInsertCard(){
        ac[0] = new Account("Iulia", 300, c);
        ac[1] = new Account("Iulia", 40, c);
        ac[2] = new Account("Iulia", 0, c);
        ac[3] = new Account("Iulia", 20, c);
        ac[4] = new Account("Iulia", 12, c);
        ac[5] = new Account("Iulia", 1000, c);
        ac[6] = new Account("Iulia", 130, c);
        ac[7] = new Account("Iulia", 9880, c);
        ac[8] = new Account("Iulia", 50, c);
        ac[9] = new Account("Iulia", 9, c);   
        Bank b = new Bank(ac);
        ATM at = new ATM(b);
        String pin = "1235";
        assertEquals("Result: ", true, at.insertCard(c, pin));
    }
    @Test
    public void TestTransaction(){
        ac[0] = new Account("Iulia", 300, c);
        ac[1] = new Account("Iulia", 40, c);
        ac[2] = new Account("Iulia", 0, c);
        ac[3] = new Account("Iulia", 20, c);
        ac[4] = new Account("Iulia", 12, c);
        ac[5] = new Account("Iulia", 1000, c);
        ac[6] = new Account("Iulia", 130, c);
        ac[7] = new Account("Iulia", 9880, c);
        ac[8] = new Account("Iulia", 50, c);
        ac[9] = new Account("Iulia", 9, c);
        Bank b = new Bank(ac);
        
        Transaction t = new CheckMoney(ac[5]);
        assertEquals("Result: ", "1000", b.executeTransaction(t));
        t = new WithdrawMoney(ac[1], 10);
        assertEquals("Result: ", null, b.executeTransaction(t));
        assertEquals("Result: ", 30, ac[1].getBalance());
        t = new ChangePin(ac[0], "1235", "4567");
        assertEquals("Result: ", "4567", b.executeTransaction(t));
    }
    
}

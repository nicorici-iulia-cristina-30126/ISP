
package isp.lab5.exercise1;


public class Card {
    //attributes:
    private String cardId;
    private String pin;
    
    //constuctor
    public Card(String pin, String cardId){
        this.pin = pin;
        this.cardId = cardId;
    }
    
    //methods:
    public String getCardId() {
        return cardId;
    }
    public String getPin() {
        return pin;
    }
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    @Override
    public String toString() {
        return "Card{" + "cardId=" + cardId + ", pin=" + pin + '}';
    }
    
    
    
}

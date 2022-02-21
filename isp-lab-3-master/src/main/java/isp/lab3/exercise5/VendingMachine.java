package isp.lab3.exercise5;

import java.util.Scanner;

public class VendingMachine {
    public int value = 0;
    private int id = 0;
    
    public void displayProducts(){
        System.out.println("Here is what we have: ");
        System.out.println("1      Twix         $2");
        System.out.println("2      KitKat       $1");
        System.out.println("3      Barni        $1");
        System.out.println("4      Fitness      $3");
        System.out.println("5      Skittles     $4");
        System.out.println("6      Diet-Bar     $3");
    }
    
    public void insertCoin(int value){
        this.value = this.value + value;
        System.out.println("You put $" + value + ".");
    }
    
    public String selectProduct(int id){
        this.id = id;
        switch(this.id){
            case 1: return "Twix";
            case 2: return "KitKat";  
            case 3: return "Barni";
            case 4: return "Fitness";
            case 5: return "Skittles";
            case 6: return "Diet-Bar";
        }
        return "Incorrect ID";
    }
    
    public void displayCredit(){
        int value = this.value;
        switch(this.id){
            case 1: value = value - 2; break;
            case 2: value = value - 1; break;  
            case 3: value = value - 1; break;
            case 4: value = value - 3; break;
            case 5: value = value - 4; break;
            case 6: value = value - 3; break;
        }
        if(value < 0){
            System.out.println("Not enough money! I can't give you the product");
        }
        else{
            this.value = value;
            System.out.println("Here is your product! :)");
            System.out.println("Current available credit: $" + this.value);
        }
    }
    
    public void moreProducts(){
        Scanner s = new Scanner(System.in);
        String str;
        while(this.value > 0){
            System.out.print("Do you want anything else(Y or N)?: ");
            str = s.next();
            if(str.equals("Y")){
                System.out.print("Please select a product: ");
                id = s.nextInt();
                String product = selectProduct(id);
                System.out.println("You selected " + product);
                displayCredit();
            }
            else if(str.equals("N")){
                System.out.println("Here is your money back($" + this.value + ")");
                this.value = 0;
            }
        }
        System.out.println("Have a great day! :)");
    }
    
    
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        System.out.println("\nWELCOME TO BLUEDAY SNACK MACHINE!");
        vm.displayProducts();
        
        System.out.print("How much money do you want to put?: ");
        int cash;
        Scanner s = new Scanner(System.in);
        cash = s.nextInt();
        vm.insertCoin(cash);
        
        int id;
        System.out.print("Please select a product: ");
        id = s.nextInt();
        String product = vm.selectProduct(id);
        if(!product.equals("Incorrect ID")){
            System.out.println("You selected " + product);
        }
        else{
            System.out.println(product);
        }
        vm.displayCredit();
        vm.moreProducts();
    }
    
}

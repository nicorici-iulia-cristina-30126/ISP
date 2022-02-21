
package isp.lab4.exercise6;


public class Employee {
    private String firstName;
    private String lastName;
    
    //constructor:
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //methods:
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getPaymentAmount(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Employee: " +  firstName + " " + lastName;
    }
    
    
    
}

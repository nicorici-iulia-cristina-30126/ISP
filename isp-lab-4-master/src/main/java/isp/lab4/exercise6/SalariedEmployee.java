
package isp.lab4.exercise6;


public class SalariedEmployee extends Employee{
    //attribute:
    private double weeklySalary;
    
    //contructor:
    public SalariedEmployee(String fName, String lName, double wSalary){
        super(fName, lName);
        this.weeklySalary = wSalary;
    }
    
    //methods:
    public double getWeeklySalary(){
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public double getPaymentAmount() {
        return 4*weeklySalary;
    }
    @Override
    public String toString() {
        return super.toString() + ". Weekly salary: " + weeklySalary + "$";
        //return super.toString();
    }
    
    
}

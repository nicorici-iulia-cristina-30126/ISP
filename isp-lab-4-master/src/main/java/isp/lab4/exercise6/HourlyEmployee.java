
package isp.lab4.exercise6;


public class HourlyEmployee extends Employee {
    //atrtributes:
    private double wage;
    private double hours;
    
    //constructor:
    public HourlyEmployee(String fName, String lName, double wage, double hours){
        super(fName, lName);
        this.wage = wage;
        this.hours = hours;
    }

    //methods:
    public double getWage() {
        return wage;
    }
    public double getHours() {
        return hours;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public double getPaymentAmount(){
        double salar;
        if(hours > 40){
            double extraHours = hours - 40;
            salar = (40 * wage) + (extraHours * wage * 1.5);
        }
        else{
            salar = hours * wage;
        }
        return salar;
    }
    @Override
    public String toString() {
        return super.toString() + ". Wage: "+ wage + "$ for " + hours+" hours per week";
    }
    
}

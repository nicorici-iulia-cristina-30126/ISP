
package isp.lab4.exercise6;


public class CommissionEmployee extends Employee{
    //attributes:
    private double grossSales;
    private double commissionSales;
    
    //contstuctor:
    public CommissionEmployee(String fName, String lName, double grossSales, double commissionSales){
        super(fName, lName);
        this.grossSales = grossSales;
        this.commissionSales = commissionSales;
    }
    
    //method:
    public double getGrossSales(){
        return grossSales;
    }
    public double getComissionSales() {
        return commissionSales;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    public void setComissionSales(double comissionSales) {
        this.commissionSales = comissionSales;
    }
    public double getPaymentAmount() {
        return grossSales*commissionSales;
    }
    @Override
    public String toString() {
        return super.toString() + ". The gross sales: " + grossSales + "$ and the commission sales: " + commissionSales + "$";
    }
    
}

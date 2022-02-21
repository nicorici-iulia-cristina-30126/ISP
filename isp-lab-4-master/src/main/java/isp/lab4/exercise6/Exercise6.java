package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args){
        HourlyEmployee hEmployee = new HourlyEmployee("Rogers", "Haaris", 12.65, 65);
        SalariedEmployee sEmployee = new SalariedEmployee("Preda", "Deniss", 894);
        CommissionEmployee cEmployee = new CommissionEmployee("Thompson", "Haniya", 123, 1000);
        
        double salary1 = hEmployee.getPaymentAmount();
        System.out.println(hEmployee + " => Salar: " + salary1 + "$ per week");
        double salary2 = sEmployee.getPaymentAmount();
        System.out.println(sEmployee + " => Salar: " + salary2 + "$ per month");
        double salary3 = cEmployee.getPaymentAmount();
        System.out.println(cEmployee + " => Salar: " + salary3 + "$ per month");
        
        
        System.out.println("\n.....................");
        Employee employee[] = new Employee[6];
        employee[0] = new HourlyEmployee("Hunt", "Kynan,", 25.00, 65);
        employee[1] = new HourlyEmployee("Compton", "Tiarna", 25.00, 40);
        employee[2] = new SalariedEmployee("Kramer", "Lilly", 894.0);
        employee[3] = new SalariedEmployee("Vincent", "Rhianne", 1000.0);
        employee[4] = new CommissionEmployee("Cherry", "Mahir", 800, 56);
        employee[5] = new CommissionEmployee("Lane", "Eisa", 800, 56);
        
        double[] salary = new double[6];
        for(int i = 0; i < 6; i++){
            salary[i] = employee[i].getPaymentAmount();
            if(i < 2){
                System.out.println(employee[i] + " => Salar: " + salary[i] + "$ per week");
            }
            else{
                System.out.println(employee[i] + " => Salar: " + salary[i] + "$ per month");
            }
        }
    }
}

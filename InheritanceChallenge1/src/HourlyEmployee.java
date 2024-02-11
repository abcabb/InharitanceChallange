public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, String hireDate,
                          double hourlyPayRate){
        super(name, birthDate, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, double hourlyPayRate){
        this(name, birthDate, "25/09/2029", "25/09/2025", hourlyPayRate);
    }

    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * this.collectPay();
    }

    @Override
    public String toString(){
        return "Total Paycheck = $" + this.collectPay() + "\n"
                +"Christmas Paycheck = $"+ this.getDoublePay() + "\n"
                + super.toString();
    }
}

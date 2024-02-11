public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired; // = false (default)

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate,
                            double annualSalary)
    {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public double collectPay(){
        double salary = annualSalary / 26;
        return (isRetired) ? 0.9 * salary : salary;
    }

    public void retire(){
        this.isRetired = true;
    }

    @Override
    public String toString(){
        return "Retirement = "+ isRetired +"\n"
                +"Current Paycheck = $"+ this.collectPay()+ "\n"
                + super.toString();
    }
}


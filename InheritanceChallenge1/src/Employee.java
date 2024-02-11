public class Employee extends Worker{
    private long employeeID;
    private String hireDate;

    private static int Id = 101;

    public Employee(){}

    public Employee(long employeeID, String hireDate){
        this.employeeID = Id++;
        this.hireDate = hireDate;
    }

    public Employee(String name, String birthDate, String endDate, String hireDate)
    {
        super(name, birthDate);
        super.terminate(endDate);
        this.employeeID = Id++;;
        this.hireDate = hireDate;
    }

    @Override
    public String toString(){
        return "Employee ID = "+ employeeID + "\n"
                +"Employee hire date = "+ hireDate + "\n"
                +super.toString();
    }
}

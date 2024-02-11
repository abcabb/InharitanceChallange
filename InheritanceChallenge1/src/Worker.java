public class Worker {
    private String name;
    private String birthDate; // dd/mm/yyyy;
    private String endDate;

    public Worker(){}

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }

    public String getName(){
        return name;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString(){
        return "Employee name = " + name + "\n"
                + "Employee birth date  = "+ birthDate + "\n"
                + "Employee end date = "+ endDate + "\n";
    }
}

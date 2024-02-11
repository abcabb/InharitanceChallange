public class Main extends Object{

    public static void main(String[] args)
    {
        SalariedEmployee butik1 = new SalariedEmployee("Butik Alli", "12/08/1992", "18/05/2028",
                "18/05/2024", 38_000);
        System.out.println(butik1);

        SalariedEmployee butik2 = new SalariedEmployee("Butik Ayşe", "30/10/2000", "18/05/2023",
                "18/05/2022", 48_000);
        System.out.println(butik2);

        HourlyEmployee waiter1 = new HourlyEmployee("Jesse", "01/02/1985",100);
        System.out.println(waiter1);
    }
}
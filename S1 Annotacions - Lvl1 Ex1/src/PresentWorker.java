public class PresentWorker extends Worker{

    private static double gas = 120.00;

    public PresentWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int timeWorked) {
        return (timeWorked * priceHour) + gas;
    }
}
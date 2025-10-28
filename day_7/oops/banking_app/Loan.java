package day_7.oops.banking_app;

public abstract class Loan {
    private double principal;
    private double rate;
    private int timeInYears;

    public Loan(double principal, double rate, int timeInYears) {
        this.principal = principal;
        this.rate = rate;
        this.timeInYears = timeInYears;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTimeInYears() {
        return timeInYears;
    }

    public abstract double calculateEMI();
}

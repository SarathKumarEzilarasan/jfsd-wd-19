package day_7.oops.banking_app;

public class HomeLoan extends Loan {

    public HomeLoan(double principal, double rate, int timeInYears) {
        super(principal, rate, timeInYears);
    }

    @Override
    public double calculateEMI() {
        double monthlyRate = (getRate() / 12) / 100;
        int months = getTimeInYears() * 12;

        return (getPrincipal() * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }
}

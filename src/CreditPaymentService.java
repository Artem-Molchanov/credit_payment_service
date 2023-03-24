public class CreditPaymentService {
    public double calculate(double creditSum, double periodMonth, double percent) {
        double realPercent = percent / 100;
        double monthRate = (1 + realPercent / 12);
        double exponent = Math.pow(monthRate, periodMonth);
        double monthPayment = (creditSum * realPercent / 12) * exponent / (exponent - 1);
        return monthPayment;
    }
}

public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на срок - год:");
        System.out.println((int) service.calculate(1_000_000, 12, 9.99));
        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на срок - два года:");
        System.out.println((int) service.calculate(1_000_000, 24, 9.99));
        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на срок - три года:");
        System.out.println((int) service.calculate(1_000_000, 36, 9.99));
    }
}

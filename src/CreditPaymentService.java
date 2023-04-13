public class CreditPaymentService {
    public double calculate(int credit, double percent, int time) {
        double month = percent / time / 100;
        double result = credit * (month * (Math.pow(1 + month, time)) / (Math.pow(1 + month, time) - 1));
        return result;
    }
}

package services;

public interface OnlinePaymentService {
    // na interface declaramos a assinatura dos metodos para depois implementar

    double paymentFee(double amount);
    double interest (double amount, int months);
}

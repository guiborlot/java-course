package services;

import java.util.Date;

public interface PaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}

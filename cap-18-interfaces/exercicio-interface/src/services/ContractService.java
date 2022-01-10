package services;

import entities.Contract;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){
        double baseValue = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double initialValue = baseValue + paymentService.interest(baseValue, i);
            double finalValue = initialValue + paymentService.paymentFee(initialValue);
            contract.addInstallment(date, finalValue);
        }
    }

    public Date addMonths(Date date, int n){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}

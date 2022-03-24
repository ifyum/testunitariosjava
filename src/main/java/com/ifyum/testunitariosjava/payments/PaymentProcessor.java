package com.ifyum.testunitariosjava.payments;

public class PaymentProcessor {

    private PaymenGateway paymenGateway;

    public PaymentProcessor(PaymenGateway paymenGateway) {
        this.paymenGateway = paymenGateway;
    }

    public boolean makePayment(double amount) {
        PaymentResponse response = paymenGateway.requestPayment(new PaymentRequest(amount));
       if (response.getStatus()== PaymentResponse.PaymentStatus.OK){
           return true;
       } else {
           return  false;
       }

    }
}

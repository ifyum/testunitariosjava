package com.ifyum.testunitariosjava.payments;

public interface PaymenGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}

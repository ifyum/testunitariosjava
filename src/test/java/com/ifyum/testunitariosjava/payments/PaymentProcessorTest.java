package com.ifyum.testunitariosjava.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentProcessor paymentProcessor;
    private PaymenGateway paymenGateway;

     //para que ejecute esto antes de cada test es propio de Junit
    @Before
    public void setup(){
         paymenGateway = Mockito.mock(PaymenGateway.class);
         paymentProcessor = new PaymentProcessor(paymenGateway);
    }

    @Test
    public void payment_is_correct() {
        Mockito.when(paymenGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

//      boolean result =   paymentProcessor.makePayment(1000);
//        assertTrue(result); es lo mismo pero resumido

        assertTrue(paymentProcessor.makePayment(1000));
    }


    @Test
    public void payment_is_incorrect() {
        Mockito.when(paymenGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));
    }

}

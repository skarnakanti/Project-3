package com.paymentapp.controller;

import com.paymentapp.service.PaymentService;
import com.paymentapp.model.Payment;

public class PaymentController {
    private PaymentService paymentService = new PaymentService();

    public String processPayment(Payment payment) {
        if (paymentService.validatePayment(payment)) {
            return paymentService.processPayment(payment);
        } else {
            return "Invalid Payment Details";
        }
    }
}

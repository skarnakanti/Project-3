package com.paymentapp.dao;

import com.paymentapp.model.Payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAO {

    // In-memory list instead of a database
    private static final List<Payment> payments = new ArrayList<>();

    public String savePayment(Payment payment) {
        payments.add(payment); // store in list
        return "Payment Successful (Stored in Memory)";
    }

    // Optional: to retrieve history
    public List<Payment> getAllPayments() {
        return new ArrayList<>(payments);
    }
}

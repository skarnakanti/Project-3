package com.paymentapp.service;

import com.paymentapp.dao.PaymentDAO;
import com.paymentapp.model.Payment;
import com.paymentapp.util.InputValidator;
import com.paymentapp.security.EncryptionUtil;

public class PaymentService {
    private PaymentDAO paymentDAO = new PaymentDAO();

    public boolean validatePayment(Payment payment) {
        return InputValidator.isValidAmount(payment.getAmount());
    }

    public String processPayment(Payment payment) {
        // Encrypt sensitive card data before storing
        payment.setCardNumber(EncryptionUtil.encrypt(payment.getCardNumber()));
        return paymentDAO.savePayment(payment);
    }
}

package com.paymentapp.security;

import java.util.Base64;

public class EncryptionUtil {
    public static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}

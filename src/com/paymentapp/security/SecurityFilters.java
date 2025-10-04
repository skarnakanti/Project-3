package com.paymentapp.security;

public class SecurityFilters {
    public static String escapeHTML(String input) {
        return input.replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("&", "&amp;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#x27;");
    }
}

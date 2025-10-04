# Payment System (Secure - In-Memory)  
**Course:** Secure Software Development (MSCS-535) — Project 3  

## Overview
This is a small, self-contained Java project that simulates an online payment system while demonstrating security best-practices to prevent **SQL Injection** and **Cross-Site Scripting (XSS)**.  
The current build uses an **in-memory** data store (`ArrayList`) — no external database or JDBC driver required — so you can run it immediately.

## Project Structure
```
Project3/
├─ src/
│  └─ com/paymentapp/
│     ├─ controller/
│     │  └─ PaymentController.java
│     ├─ service/
│     │  └─ PaymentService.java
│     ├─ dao/
│     │  └─ PaymentDAO.java         # in-memory implementation
│     ├─ model/
│     │  └─ Payment.java
│     ├─ util/
│     │  └─ InputValidator.java
│     └─ security/
│        ├─ EncryptionUtil.java
│        └─ SecurityFilters.java
├─ out/                            # compiled .class files
└─ README.md
```

## What’s implemented (security)
- **SQL Injection:** There is no SQL in the in-memory version. If you switch to DB, the example code uses `PreparedStatement` and demonstrates how to parameterize queries to avoid SQL injection.
- **XSS (Cross-Site Scripting):** Any textual output intended for display is sanitized using `SecurityFilters.escapeHTML(...)` (escapes `<`, `>`, `&`, `"` and `'`).
- **Sensitive Data:** Card numbers are handled through `EncryptionUtil.encrypt(...)` before storage (example uses Base64—replace with a proper encryption method for production).
- **Input Validation:** `InputValidator.isValidAmount(...)` validates that amount is positive.

## Quick run (You already have `out` compiled)
Open **PowerShell** and navigate to the `out` folder:

```powershell
java Main
```

Expected output (example):
```
Payment Successful (Stored in Memory)
Payment Successful (Stored in Memory)

All Payments:
User 1 paid $100.0
User 2 paid $250.75
```

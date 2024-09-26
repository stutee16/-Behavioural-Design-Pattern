# Strategy Pattern Demo

This project demonstrates the **Strategy Design Pattern** in Java through a payment system in a shopping cart. The Strategy Pattern is a behavioral design pattern that allows a client to choose an algorithm or method at runtime. In this case, we allow different payment strategies to be selected when checking out from a shopping cart.

## Overview

In this project, the **ShoppingCart** class can use different payment strategies (like **CreditCardPayment** and **PayPalPayment**) to process payments. By using the Strategy Pattern, the system is flexible and can accommodate new payment methods without modifying existing code.

### Problem Description

- The **ShoppingCart** needs to handle payments using different methods, such as credit card and PayPal.
- Instead of hardcoding the payment method into the cart, we use the **Strategy Pattern** to allow the cart to switch between different payment strategies at runtime.
- The cart can dynamically change the payment method based on user choice (e.g., credit card or PayPal).

### Components

1. **PaymentStrategy Interface**: Defines a common interface for all payment strategies.
   - `void pay(double amount);`

2. **CreditCardPayment Class**: Implements the **PaymentStrategy** interface for handling payments through credit cards.
   - Takes in a card number and processes the payment.

3. **PayPalPayment Class**: Implements the **PaymentStrategy** interface for handling payments through PayPal.
   - Takes in an email address and processes the payment.

4. **ShoppingCart Class**: The client that uses a payment strategy to handle the payment process.
   - Allows setting different payment strategies dynamically and processes payment using the selected strategy.

5. **StrategyPatternDemo**: The main class where the entire process is demonstrated by simulating payments using both a credit card and PayPal.


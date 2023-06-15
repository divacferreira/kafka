package com.edvaldo.paymentservice.service;
import com.edvaldo.paymentservice.model.Payment;
public interface PaymentService {

    void sendPayment(Payment payment);
}
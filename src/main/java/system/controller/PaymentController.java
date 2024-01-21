package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.PaymentNotFoundException;
import system.model.Payment;
import system.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;


    @GetMapping
    public List<Payment> getAllPayments() {
        try {
            return paymentService.getAllPayments();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Payments", e);
        }
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id)  {
        return paymentService.findById(id).orElseThrow(() -> new PaymentNotFoundException("Payment not found with ID: " + id));
    }

}

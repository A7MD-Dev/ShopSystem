package system.service;

import org.springframework.stereotype.Service;
import system.model.Payment;
import system.model.repository.PaymentRepository;
import java.util.List;
import java.util.Optional;


@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment createUser(Payment role) {
        return paymentRepository.save(role);
    }

    public Optional<Payment> findById(Long id) {
        return paymentRepository.findById(id);
    }

    public Payment updateCategory(Payment role) {
        return paymentRepository.save(role);
    }

    public void deleteById(Long id) {
        paymentRepository.deleteById(id);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

}

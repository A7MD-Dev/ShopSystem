package system.service;

import org.springframework.stereotype.Service;
import system.model.Discount;
import system.model.repository.DiscountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DiscountService {
    private final DiscountRepository discountRepository;

    public DiscountService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public Discount createDiscount(Discount discount) {
        return discountRepository.save(discount);
    }

    public Optional<Discount> findById(Long id) {
        return discountRepository.findById(id);
    }

    public Discount updateDiscount(Discount discount) {
        return discountRepository.save(discount);
    }

    public void deleteById(Long id) {
        discountRepository.deleteById(id);
    }

    public List<Discount> getAllDiscounts() {
        return discountRepository.findAll();
    }

}

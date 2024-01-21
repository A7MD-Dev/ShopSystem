package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.DiscountNotFoundException;
import system.model.Discount;
import system.service.DiscountService;

import java.util.List;

@RestController
@RequestMapping("/api/discounts")
public class DiscountController {
    @Autowired
    private DiscountService discountService;


    @GetMapping
    public List<Discount> getAllDiscounts() {
        try {
            return discountService.getAllDiscounts();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Discounts", e);
        }
    }

    @GetMapping("/{id}")
    public Discount getDiscountById(@PathVariable Long id)  {
        return discountService.findById(id).orElseThrow(() -> new DiscountNotFoundException("Discount not found with ID: " + id));
    }

}

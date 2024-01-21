package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.ShippingAddressNotFoundException;
import system.model.ShippingAddress;
import system.service.ShippingAddressService;

import java.util.List;

@RestController
@RequestMapping("/api/shippingAddresses")
public class ShippingAddressController {
    @Autowired
    private ShippingAddressService shippingAddressService;


    @GetMapping
    public List<ShippingAddress> getAllShippingAddresses() {
        try {
            return shippingAddressService.getAllShippingAddresses();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve ShippingAddresss", e);
        }
    }

    @GetMapping("/{id}")
    public ShippingAddress getShippingAddressById(@PathVariable Long id)  {
        return shippingAddressService.findById(id).orElseThrow(() -> new ShippingAddressNotFoundException("ShippingAddress not found with ID: " + id));
    }

}

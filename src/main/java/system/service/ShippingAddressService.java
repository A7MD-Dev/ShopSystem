package system.service;

import org.springframework.stereotype.Service;
import system.model.ShippingAddress;
import system.model.repository.ShippingAddressRepository;
import java.util.List;
import java.util.Optional;


@Service
public class ShippingAddressService {

    private final ShippingAddressRepository shippingAddressRepository;

    public ShippingAddressService(ShippingAddressRepository shippingAddressRepository) {
        this.shippingAddressRepository = shippingAddressRepository;
    }

    public ShippingAddress createShippingAddress(ShippingAddress shippingAddress) {
        return shippingAddressRepository.save(shippingAddress);
    }

    public Optional<ShippingAddress> findById(Long id) {
        return shippingAddressRepository.findById(id);
    }

    public ShippingAddress updateCategory(ShippingAddress user) {
        return shippingAddressRepository.save(user);
    }

    public void deleteById(Long id) {
        shippingAddressRepository.deleteById(id);
    }

    public List<ShippingAddress> getAllShippingAddresses() {
        return shippingAddressRepository.findAll();
    }

}

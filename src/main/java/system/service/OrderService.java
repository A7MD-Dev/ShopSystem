package system.service;

import org.springframework.stereotype.Service;
import system.model.Order;
import system.model.repository.OrderRepository;
import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createUser(Order role) {
        return orderRepository.save(role);
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    public Order updateCategory(Order role) {
        return orderRepository.save(role);
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}

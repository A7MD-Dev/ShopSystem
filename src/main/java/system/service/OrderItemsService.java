package system.service;

import org.springframework.stereotype.Service;
import system.model.OrderItems;
import system.model.repository.OrderItemsRepository;
import java.util.List;
import java.util.Optional;


@Service
public class OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;

    public OrderItemsService(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }

    public OrderItems createUser(OrderItems role) {
        return orderItemsRepository.save(role);
    }

    public Optional<OrderItems> findById(Long id) {
        return orderItemsRepository.findById(id);
    }

    public OrderItems updateCategory(OrderItems role) {
        return orderItemsRepository.save(role);
    }

    public void deleteById(Long id) {
        orderItemsRepository.deleteById(id);
    }

    public List<OrderItems> getAllOrderItemss() {
        return orderItemsRepository.findAll();
    }

}

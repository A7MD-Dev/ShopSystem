package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.OrderNotFoundException;
import system.model.Order;
import system.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping
    public List<Order> getAllOrders() {
        try {
            return orderService.getAllOrders();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Orders", e);
        }
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id)  {
        return orderService.findById(id).orElseThrow(() -> new OrderNotFoundException("Order not found with ID: " + id));
    }

}

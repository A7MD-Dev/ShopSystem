package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.OrderItemsNotFoundException;
import system.model.OrderItems;
import system.service.OrderItemsService;

import java.util.List;

@RestController
@RequestMapping("/api/orderItems")
public class OrderItemsController {
    @Autowired
    private OrderItemsService orderItemsService;


    @GetMapping
    public List<OrderItems> getAllOrderItems() {
        try {
            return orderItemsService.getAllOrderItemss();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve OrderItems", e);
        }
    }

    @GetMapping("/{id}")
    public OrderItems getOrderItemsById(@PathVariable Long id)  {
        return orderItemsService.findById(id).orElseThrow(() -> new OrderItemsNotFoundException("OrderItems not found with ID: " + id));
    }

}

package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.RoleNotFoundException;
import system.model.Role;
import system.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;


    @GetMapping
    public List<Role> getAllRoles() {
        try {
            return roleService.getAllRoles();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Roles", e);
        }
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id)  {
        return roleService.findById(id).orElseThrow(() -> new RoleNotFoundException("Role not found with ID: " + id));
    }

}

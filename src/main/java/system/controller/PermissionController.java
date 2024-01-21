package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.PermissionNotFoundException;
import system.model.Permission;
import system.service.PermissionService;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;


    @GetMapping
    public List<Permission> getAllPermissions() {
        try {
            return permissionService.getAllPermissions();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Permissions", e);
        }
    }

    @GetMapping("/{id}")
    public Permission getPermissionById(@PathVariable Long id)  {
        return permissionService.findById(id).orElseThrow(() -> new PermissionNotFoundException("Permission not found with ID: " + id));
    }

}

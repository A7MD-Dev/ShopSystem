package system.service;

import org.springframework.stereotype.Service;
import system.model.Permission;
import system.model.repository.PermissionRepository;
import java.util.List;
import java.util.Optional;


@Service
public class PermissionService {

    private final PermissionRepository permissionRepository;

    public PermissionService(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    public Permission createUser(Permission role) {
        return permissionRepository.save(role);
    }

    public Optional<Permission> findById(Long id) {
        return permissionRepository.findById(id);
    }

    public Permission updateCategory(Permission role) {
        return permissionRepository.save(role);
    }

    public void deleteById(Long id) {
        permissionRepository.deleteById(id);
    }

    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

}

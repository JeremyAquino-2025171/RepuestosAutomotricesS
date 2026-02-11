package com.JeremyAquino.RepuestosAutomotrices.controller;
import com.JeremyAquino.RepuestosAutomotrices.entity.Proveedor;
import com.JeremyAquino.RepuestosAutomotrices.service.ProveedorService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/Proveedores")

public class ProveedorController {

    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService){this.proveedorService=proveedorService;}

    @GetMapping
    public List<Proveedor> getAllProveedor(){return proveedorService.getAllProveedores();}

    @PostMapping
    public ResponseEntity<Object> createProveedor(@Valid @RequestBody Proveedor proveedor){
        try{
            Proveedor createdProveedor = proveedorService.saveProveedor(proveedor);
            return new ResponseEntity<>(createdProveedor, HttpStatus.CREATED);
        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProveedor(@PathVariable Integer id, @Valid @RequestBody Proveedor proveedor){
        try {
            Proveedor updateProveedor = proveedorService.updateProveedor(id, proveedor);
            return ResponseEntity.ok(updateProveedor);
        } catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Object> deleteProveedor (@PathVariable Integer id) {
        try {
            proveedorService.deleteProveedor(id);
            return ResponseEntity.ok("el empleado fue eliminado con exito "+ id);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar:"+ e.getMessage());

        }

    }
}

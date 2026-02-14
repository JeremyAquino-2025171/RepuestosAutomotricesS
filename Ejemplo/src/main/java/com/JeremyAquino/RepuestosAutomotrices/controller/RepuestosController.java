package com.JeremyAquino.RepuestosAutomotrices.controller;

import com.JeremyAquino.RepuestosAutomotrices.entity.Repuestos;
import com.JeremyAquino.RepuestosAutomotrices.service.RepuestosService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Repuestos")
public class RepuestosController {

    private final RepuestosService repuestosService;

    public RepuestosController(RepuestosService repuestosService) {
        this.repuestosService = repuestosService;
    }

    @GetMapping
    public List<Repuestos> getAllRepuestos() {
        return repuestosService.getAllRepuestos();
    }

    @PostMapping
    public ResponseEntity<Object> createRepuestos(@Valid @RequestBody Repuestos repuestos) {
        try {
            Repuestos createdRepuestos = repuestosService.saveRepuestos(repuestos);
            return new ResponseEntity<>(createdRepuestos, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteRepuestos(@PathVariable Integer id) {
        try {
            repuestosService.deleteRepuestos(id);
            return ResponseEntity.ok("El repuesto fue eliminado con éxito: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar: " + e.getMessage());
        }
    }
}
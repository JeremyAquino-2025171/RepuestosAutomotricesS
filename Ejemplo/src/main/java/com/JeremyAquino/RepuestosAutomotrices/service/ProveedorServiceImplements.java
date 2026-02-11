package com.JeremyAquino.RepuestosAutomotrices.service;

import com.JeremyAquino.RepuestosAutomotrices.entity.Proveedor;
import com.JeremyAquino.RepuestosAutomotrices.repository.ProveedorRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ProveedorServiceImplements implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorServiceImplements (ProveedorRepository proveedorRepository){
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedor> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor getProveedorById (Integer id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    @Override
    public Proveedor saveProveedor (Proveedor proveedor) throws RuntimeException {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor updateProveedor (Integer id, Proveedor proveedorDetalles) {
        Proveedor proveedorExistente = proveedorRepository.findById(id).orElse(null);
        if (proveedorExistente != null) {
            proveedorExistente.setNombreProveedor(proveedorDetalles.getNombreProveedor());
            proveedorExistente.setEmailEmpleado(proveedorDetalles.getEmailEmpleado());
            proveedorExistente.setDireccionProveedor(proveedorDetalles.getDireccionProveedor());
            proveedorExistente.setTelefonoProveedor(proveedorDetalles.getTelefonoProveedor());
            return proveedorRepository.save(proveedorExistente);
        }
        return null;
    }

    @Override
    public void deleteProveedor (Integer id) {
        proveedorRepository.deleteById(id);
    }
}
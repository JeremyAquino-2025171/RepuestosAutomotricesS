package com.JeremyAquino.RepuestosAutomotrices.service;

import com.JeremyAquino.RepuestosAutomotrices.entity.Repuestos;
import com.JeremyAquino.RepuestosAutomotrices.repository.RepuestosRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class RepuestosServiceImplements implements RepuestosService {

    private final RepuestosRepository repuestosRepository;

    @Autowired
    public RepuestosServiceImplements(RepuestosRepository repuestosRepository) {
        this.repuestosRepository = repuestosRepository;
    }

    @Override
    public List<Repuestos> getAllRepuestos() {
        return repuestosRepository.findAll();
    }

    @Override
    public Repuestos getRepuestosById(Integer id) {
        return repuestosRepository.findById(id).orElse(null);
    }

    @Override
    public Repuestos saveRepuestos(Repuestos repuestos) {
        return repuestosRepository.save(repuestos);
    }

    @Override
    public Repuestos updateRepuestos(Integer id, Repuestos repuestosDetalles) {
        Repuestos repuestosExistente = repuestosRepository.findById(id).orElse(null);
        if (repuestosExistente != null) {
            repuestosExistente.setNombreRepuesto(repuestosDetalles.getNombreRepuesto());
            repuestosExistente.setCategoriaRepuesto(repuestosDetalles.getCategoriaRepuesto());
            repuestosExistente.setPrecioCompra(repuestosDetalles.getPrecioCompra());
            repuestosExistente.setPrecioVenta(repuestosDetalles.getPrecioVenta());
            repuestosExistente.setProveedor(repuestosDetalles.getProveedor());
            return repuestosRepository.save(repuestosExistente);
        }
        return null;
    }

    @Override
    public void deleteRepuestos(Integer id) {
        repuestosRepository.deleteById(id);
    }
}
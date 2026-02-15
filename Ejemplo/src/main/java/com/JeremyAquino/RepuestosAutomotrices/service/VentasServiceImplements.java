package com.JeremyAquino.RepuestosAutomotrices.service;

import com.JeremyAquino.RepuestosAutomotrices.entity.Ventas;
import com.JeremyAquino.RepuestosAutomotrices.repository.VentasRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class VentasServiceImplements implements VentasService {

    private final VentasRepository ventasRepository;

    @Autowired
    public VentasServiceImplements(VentasRepository ventasRepository) {
        this.ventasRepository = ventasRepository;
    }

    @Override
    public List<Ventas> getAllVentas() {
        return ventasRepository.findAll();
    }

    @Override
    public Ventas getVentasById(Integer id) {
        return ventasRepository.findById(id).orElse(null);
    }

    @Override
    public Ventas saveVentas(Ventas ventas) {
        return ventasRepository.save(ventas);
    }

    @Override
    public Ventas updateVentas(Integer id, Ventas ventasDetalles) {
        Ventas ventasExistente = ventasRepository.findById(id).orElse(null);
        if (ventasExistente != null) {
            ventasExistente.setCantidad(ventasDetalles.getCantidad());
            ventasExistente.setTotalVenta(ventasDetalles.getTotalVenta());
            ventasExistente.setFechaVenta(ventasDetalles.getFechaVenta());
            ventasExistente.setRepuesto(ventasDetalles.getRepuesto());
            return ventasRepository.save(ventasExistente);
        }
        return null;
    }

    @Override
    public void deleteVentas(Integer id) {
        ventasRepository.deleteById(id);
    }
}
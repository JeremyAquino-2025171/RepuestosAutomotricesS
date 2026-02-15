package com.JeremyAquino.RepuestosAutomotrices.service;

import com.JeremyAquino.RepuestosAutomotrices.entity.Ventas;
import java.util.List;

public interface VentasService {
    List<Ventas> getAllVentas();
    Ventas getVentasById(Integer id);
    Ventas saveVentas(Ventas ventas);
    Ventas updateVentas(Integer id, Ventas ventas);
    void deleteVentas(Integer id);
}
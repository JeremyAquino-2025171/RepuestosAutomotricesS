package com.JeremyAquino.RepuestosAutomotrices.service;

import com.JeremyAquino.RepuestosAutomotrices.entity.Repuestos;
import java.util.List;

public interface RepuestosService {
    List<Repuestos> getAllRepuestos();
    Repuestos getRepuestosById(Integer id);
    Repuestos saveRepuestos(Repuestos repuestos);
    Repuestos updateRepuestos(Integer id, Repuestos repuestos);
    void deleteRepuestos(Integer id);
}
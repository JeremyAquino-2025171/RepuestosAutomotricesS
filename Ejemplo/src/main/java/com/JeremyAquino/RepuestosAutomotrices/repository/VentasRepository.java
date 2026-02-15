package com.JeremyAquino.RepuestosAutomotrices.repository;

import com.JeremyAquino.RepuestosAutomotrices.entity.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {
}

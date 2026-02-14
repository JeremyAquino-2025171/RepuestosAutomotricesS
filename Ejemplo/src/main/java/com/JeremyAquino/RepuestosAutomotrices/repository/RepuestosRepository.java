package com.JeremyAquino.RepuestosAutomotrices.repository;


import com.JeremyAquino.RepuestosAutomotrices.entity.Repuestos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepuestosRepository extends JpaRepository<Repuestos, Integer> {
}

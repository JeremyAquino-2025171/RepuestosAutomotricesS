package com.JeremyAquino.RepuestosAutomotrices.repository;

import com.JeremyAquino.RepuestosAutomotrices.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {


}

package com.luis.diaz.sistemavehiculos.repository;

import com.luis.diaz.sistemavehiculos.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    // Aquí puedes añadir consultas personalizadas si las necesitas
}

package com.luis.diaz.sistemavehiculos.service;

import com.luis.diaz.sistemavehiculos.model.Vehiculo;
import com.luis.diaz.sistemavehiculos.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    // Lista todos los vehículos
    public List<Vehiculo> listar() {
        return vehiculoRepository.findAll();
    }

    // Guarda un vehículo (create/update)
    public Vehiculo guardar(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }
}

package com.luis.diaz.sistemavehiculos.controller;

import com.luis.diaz.sistemavehiculos.model.Vehiculo;
import com.luis.diaz.sistemavehiculos.service.VehiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
@CrossOrigin(origins = "*")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping
    public ResponseEntity<List<Vehiculo>> listar() {
        List<Vehiculo> lista = vehiculoService.listar();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<Vehiculo> crear(@RequestBody Vehiculo vehiculo) {
        Vehiculo creado = vehiculoService.guardar(vehiculo);
        return ResponseEntity.created(URI.create("/api/vehiculos/" + creado.getId())).body(creado);
    }
}


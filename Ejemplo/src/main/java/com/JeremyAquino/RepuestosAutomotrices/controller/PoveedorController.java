package com.JeremyAquino.RepuestosAutomotrices.controller;
import com.JeremyAquino.RepuestosAutomotrices.service.ProveedorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/Proveedores")

public class PoveedorController {

    private final ProveedorService proveedorService;

    public PoveedorController (ProveedorService proveedorService){this.proveedorService=proveedorService;}


}

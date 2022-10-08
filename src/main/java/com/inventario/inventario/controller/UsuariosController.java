/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.controller;

import com.inventario.inventario.dto.UsuariosDto;
import com.inventario.inventario.model.Usuarios;
import com.inventario.inventario.service.UsuariosServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Wilson
 */
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping({"/usuarios"})
public class UsuariosController {
    
    @Autowired
    UsuariosServicio usuarioServicio;
    
    
    @PostMapping(path = "/login")
    @ResponseStatus(HttpStatus.OK)
    //@ApiOperation(value = "Obtiene detalle de los eventos", notes = "")
    public ResponseEntity<Optional<Usuarios>> obtenerAsuetosCreados(@RequestBody UsuariosDto dto) {
        return ResponseEntity.ok(usuarioServicio.getUsuarioByUserAndPass(dto));
    }
    
}

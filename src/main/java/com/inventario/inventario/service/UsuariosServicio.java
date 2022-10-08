/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.service;

import com.inventario.inventario.dto.UsuariosDto;
import com.inventario.inventario.model.Usuarios;
import com.inventario.inventario.repository.UsuariosRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Wilson
 */
@Service
public class UsuariosServicio {
    @Autowired
    UsuariosRepository usuarioServicio;
    
    public Optional<Usuarios> getUsuarioByUserAndPass(UsuariosDto dto){
        return this.usuarioServicio.usuarios(dto.getUsuario(),dto.getPassword());
    }

    
}

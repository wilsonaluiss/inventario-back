/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.service;

import com.inventario.inventario.projection.BodegaExistenciaProjection;
import com.inventario.inventario.projection.InventarioProjection;
import com.inventario.inventario.repository.InventarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pao
 */
@Service
public class InventarioService {

    @Autowired
    InventarioRepositorio InventarioServicio;
    
    public List<InventarioProjection> getInventario(){
        return this.InventarioServicio.traerTabla();
    }
    
    public List<BodegaExistenciaProjection> listBodegasExistencia(){
        return this.InventarioServicio.getExistenciasBodegas();
    }
}

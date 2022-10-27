/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.controller;

import static com.inventario.inventario.controller.BodegaController.LOG;
import com.inventario.inventario.model.BodegaModel;
import com.inventario.inventario.projection.BodegaExistenciaProjection;
import com.inventario.inventario.projection.InventarioProjection;
import com.inventario.inventario.service.InventarioService;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pao
 */
@RestController
@RequestMapping({"/inventario"})
public class InventarioController {
   
   
    @Autowired
    InventarioService service;
    
    
    @GetMapping(path = "/list")
    public List<InventarioProjection> getinventario() {
        
        LOG.info("consultando inventario");
        try {
            return service.getInventario();
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return null;
        }
    }
    
        @GetMapping(path = "/bodegas")
    public List<BodegaExistenciaProjection> existenciabodegas() {
        
        LOG.info("consultando existencia de bodegas");
        try {
            return service.listBodegasExistencia();
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return null;
        }
    }
    

}


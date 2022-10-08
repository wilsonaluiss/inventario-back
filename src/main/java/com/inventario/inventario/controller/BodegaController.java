/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.controller;

import static com.inventario.inventario.controller.ProductoController.LOG;
import com.inventario.inventario.dto.BodegaDto;
import com.inventario.inventario.dto.ProductoDto;
import com.inventario.inventario.model.BodegaModel;
import com.inventario.inventario.service.BodegaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Wilson
 */
@RestController
@Slf4j
public class BodegaController {
    final static Logger LOG = LoggerFactory.getLogger(BodegaController.class);
    
    @Autowired
    BodegaService bodegaService;
    
    @PostMapping(value = "/bodega/crear")
    public Boolean crearBodega(@Valid @RequestBody BodegaModel bodega) {
        log.info("Creando una bodega");
        try {
            return bodegaService.crearBodega(bodega);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return false;
        }
    }
    
    @PutMapping(value = "/bodega/modificarBodega/{idBodega}")
    public Boolean ModificarProducto(@Valid @PathVariable Integer idBodega, @RequestBody BodegaDto dto) {
        log.info("Modificando bodega");
        try {
            return bodegaService.modificarBodega(idBodega, dto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return false;
        }
    }
    
}

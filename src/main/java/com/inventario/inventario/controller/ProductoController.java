/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.controller;

import static com.inventario.inventario.controller.BodegaController.LOG;
import com.inventario.inventario.dto.ProductoDto;
import com.inventario.inventario.model.BodegaModel;
import com.inventario.inventario.model.ProductoModel;
import com.inventario.inventario.projection.ProductoProjection;
import com.inventario.inventario.service.ProductoService;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
public class ProductoController {
    
    final static Logger LOG = LoggerFactory.getLogger(ProductoController.class);
    
    @Autowired
    ProductoService productoService;
    
    @PostMapping(value = "/producto/crear")
    public Boolean crearProducto(@Valid @RequestBody ProductoModel producto) {
        log.info("Creando producto");
        try {
            return productoService.crearProducto(producto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return false;
        }
    }
    
    @PutMapping(value = "/producto/modificarProducto/{idProducto}")
    public Boolean ModificarProducto(@Valid @PathVariable Integer idProducto, @RequestBody ProductoDto dto) {
        log.info("Modificando producto");
        try {
            return productoService.modificarProducto(idProducto, dto);
        } catch (Exception e) {
            LOG.error("Error: " + e);
            return false;
        }
    }
    
   
}

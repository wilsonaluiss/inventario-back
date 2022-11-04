/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.service;

import com.inventario.inventario.dto.ProductoDto;
import com.inventario.inventario.model.BodegaModel;
import com.inventario.inventario.model.ProductoModel;
import com.inventario.inventario.projection.ProductoProjection;
import com.inventario.inventario.repository.ProductoRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Wilson
 */
@Service
@Slf4j
public class ProductoService {

    final static Logger LOG = LoggerFactory.getLogger(ProductoService.class);
    @Autowired
    ProductoRepository productoRepository;

    @Transactional(rollbackFor = {Exception.class})
    public Boolean crearProducto(ProductoModel pProducto) {
        LOG.debug("Creando producto " + pProducto.toString());
        ProductoModel producto = productoRepository.findByNombre(pProducto.getNombre());
        try {
            if (producto == null) {
                productoRepository.save(pProducto);
            }
            return true;
        } catch (Exception e) {
            LOG.error("ERROR" + e);
            return false;
        }
    }

    @Transactional(rollbackFor = {Exception.class})
    public Boolean modificarProducto(Integer idUsuario, ProductoDto dto) {
        LOG.debug("Modificando Producto " + dto);
        final ProductoModel producto = productoRepository.findById(idUsuario).orElse(null);
        if (producto != null) {
            producto.setNombre(dto.getNombre());
            producto.setDescripcion(dto.getDescripcion());
            producto.setEstado(dto.getEstado());
            producto.setFechamodificacion(dto.getFechamodificacion());
            return true;
        } else {
            return false;
        }
    }

    public Boolean inactivarProducto(Integer idUsuario, ProductoDto dto) {
        LOG.debug("Inactivando Producto " + dto);
        final ProductoModel producto = productoRepository.findById(idUsuario).orElse(null);
        if (producto != null) {
            producto.setEstado(dto.getEstado());
            return true;
        } else {
            return false;
        }
    }

    public List<ProductoProjection> getProductos() {
        return this.productoRepository.traerProductos();
    }

    public List<ProductoModel> obtenerProductos() {
        return (List<ProductoModel>) productoRepository.findAll();
    }
}

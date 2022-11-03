/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.service;

import com.inventario.inventario.dto.ProductoDto;
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
    public Boolean crearProducto(ProductoModel pProducto){
        ProductoModel producto = productoRepository.findByNombre(pProducto.getNombre());
        try {
            if(producto == null ){
                productoRepository.save(pProducto);
                
            }else{
                return false;
            }
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    @Transactional(rollbackFor = {Exception.class})
    public Boolean modificarProducto(Integer idUsuario ,ProductoDto dto){
        LOG.debug("Modificando Producto "+ dto);
        final ProductoModel producto = productoRepository.findById(idUsuario).orElse(null);
        if(producto != null){
            producto.setNombre(dto.getNombre());
            producto.setDescripcion(dto.getDescripcion());
            producto.setEstado(dto.getEstado());
            producto.setFechamodificacion(dto.getFechamodificacion());
            return true;
        }else{
            return false;
        }
    }
    
    public Boolean inactivarProducto(Integer idUsuario ,ProductoDto dto){
        LOG.debug("Inactivando Producto "+ dto);
        final ProductoModel producto = productoRepository.findById(idUsuario).orElse(null);
        if(producto != null){
            producto.setEstado(dto.getEstado());
            return true;
        }else{
            return false;
        }
    }
    
    public   List<ProductoProjection> getProductos(){
        return this.productoRepository.traerProductos();
    }
    
}

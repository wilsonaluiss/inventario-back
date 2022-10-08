/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.service;

import com.inventario.inventario.dto.BodegaDto;
import com.inventario.inventario.dto.ProductoDto;
import com.inventario.inventario.model.BodegaModel;
import com.inventario.inventario.model.ProductoModel;
import com.inventario.inventario.repository.BodegaRepository;
import static com.inventario.inventario.service.ProductoService.LOG;
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
@org.springframework.transaction.annotation.Transactional
public class BodegaService {
    
    final static Logger LOG = LoggerFactory.getLogger(BodegaService.class);
    @Autowired
    BodegaRepository bodegaRepository;
    
    /**
     * Crea un nuevo Evento
     *
     * @param pRol {@link AccylEventos}
     * @return Objeto Evento con los valores que fueron ingresados
     */
    public Boolean crearBodega(BodegaModel pBodega){
        LOG.debug("Creando Bodega " + pBodega.toString());
        BodegaModel bodega = bodegaRepository.findByNombre(pBodega.getNombre());
        try {
            if(bodega == null){
                bodegaRepository.save(pBodega);
            }else{
                return false;
            }
          return true;  
        } catch (Exception e) {
            return false;
        }
    }
    
    @Transactional(rollbackFor = {Exception.class})
    public Boolean modificarBodega(Integer idBodega ,BodegaDto dto){
        LOG.debug("Modificando Producto "+ dto);
        final BodegaModel bodega = bodegaRepository.findById(idBodega).orElse(null);
        if(bodega != null){
            bodega.setNombre(dto.getNombre());
            bodega.setDireccion(dto.getDireccion());
            bodega.setEstado(dto.getEstado());
            bodega.setFechamodificacion(dto.getFechamodificacion());
            return true;
        }else{
            return false;
        }
    }
    
}

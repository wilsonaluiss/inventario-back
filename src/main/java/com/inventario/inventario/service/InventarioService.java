/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.service;

import com.inventario.inventario.dto.TrasladoDto;
import com.inventario.inventario.projection.BodegaExistenciaProjection;
import com.inventario.inventario.projection.InventarioProjection;
import com.inventario.inventario.projection.MovimientoProjection;
import com.inventario.inventario.repository.InventarioRepositorio;
import static com.inventario.inventario.service.ProductoService.LOG;
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
    
    public boolean trasladoBodega(TrasladoDto traslado){
        try {
            this.InventarioServicio.trasladoBodeaga(traslado.getIdBodegaOrigen(),
                                                    traslado.getIdBodegaDestino(), 
                                                    traslado.getIdProducto(), 
                                                    traslado.getCantidad());
            return true;
        } catch (Exception e) {
            LOG.debug("Error al realizar traslado "+e.getMessage());
            return false;
        }
    }
    public List<MovimientoProjection> getMovimiento(){
        return this.InventarioServicio.traerMovimiento();
    }
    
}

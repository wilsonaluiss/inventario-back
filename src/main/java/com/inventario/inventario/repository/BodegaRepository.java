/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.repository;

import com.inventario.inventario.model.BodegaModel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilson
 */
public interface BodegaRepository extends CrudRepository<BodegaModel, Integer> {
    
    
    BodegaModel findByNombre(String bodega);
}

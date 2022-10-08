/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.repository;

import com.inventario.inventario.model.ProductoModel;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilson
 */
public interface ProductoRepository extends CrudRepository<ProductoModel, Integer> {

    ProductoModel findByNombre(String nombre);
    
    
}

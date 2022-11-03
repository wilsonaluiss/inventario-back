/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.repository;

import com.inventario.inventario.model.ProductoModel;
import com.inventario.inventario.projection.InventarioProjection;
import com.inventario.inventario.projection.ProductoProjection;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilson
 */
public interface ProductoRepository extends CrudRepository<ProductoModel, Integer> {

    ProductoModel findByNombre(String nombre);
    
    @Query(value = "SELECT Id_Producto ,nombre ,precio"
             + " FROM  Producto", nativeQuery = true)
    List<ProductoProjection> traerProductos();
    
}

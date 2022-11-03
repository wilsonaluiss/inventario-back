/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.repository;

import com.inventario.inventario.model.InventarioModel;
import com.inventario.inventario.projection.*;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author pao
 */


public interface InventarioRepositorio extends  JpaRepository <InventarioModel, Integer>{
    
     @Query(value = "SELECT pt.Id_Producto , pt.nombre AS nombreProducto,iv.existencias AS existenciasProducto,pt.descripcion AS descripcionProducto,pt.precio AS precioProducto,Bd.nombre AS Bodega"
             + " FROM Inventario iv"
             + " INNER JOIN Producto pt on iv.Id_Producto  =  pt.Id_Producto"
             + " INNER JOIN Bodega Bd on iv.Id_Bodega = Bd.Id_Bodega", nativeQuery = true)
    List<InventarioProjection> traerTabla();
     
        @Query(value = "SELECT  Bd.Id_Bodega ,Bd.nombre, iv.Id_Producto ,iv.existencias"
             + " FROM Inventario iv"
             + " INNER JOIN Bodega Bd on iv.Id_Bodega = Bd.Id_Bodega", nativeQuery = true)
    List<BodegaExistenciaProjection> getExistenciasBodegas();
    
    @Query(value = "CALL TrasladoBodega(:v_idbodegaorigen,:v_idbodegadestino ,:v_idproducto ,:v_cantidad,0);", nativeQuery = true)
    int trasladoBodeaga(@Param("v_idbodegaorigen") Integer IdBodegaOrgien,
                        @Param("v_idbodegadestino") Integer IdBodegaDestino,
                        @Param("v_idproducto") Integer IdProducto,
                        @Param("v_cantidad") Integer Cantidad);
    
    
     @Query(value = " \n" +
           " select b.nombre as NombreBodega  ,p.nombre as NombreProducto,"
             + "t.nombre_movimiento as tipoMovimiento,mp.cantidad as cantidadProducto,mp.fecha_movimiento as Fecha  \n" +
               " from movimiento_producto mp \n" +
               " inner join producto p on mp.id_producto  = p.id_producto \n" +
               " inner join bodega b on mp.id_bodega =b.id_bodega \n" +
               " inner join tipomovimiento t on mp.id_tmovimiento =t.id_tmovimiento ", nativeQuery = true)
    List<MovimientoProjection> traerMovimiento();
}

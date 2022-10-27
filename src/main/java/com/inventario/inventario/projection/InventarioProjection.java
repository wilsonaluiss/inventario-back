/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.projection;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author pao
 */
public interface InventarioProjection {
    
   
    String getId_Producto ();
    String getNombreProducto ();
    String getExistenciasProducto ();
    String getDescripcionProducto ();
    String getPrecioProducto ();
    String getBodega ();
   
}

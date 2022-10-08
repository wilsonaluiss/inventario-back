/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.projection;

import java.util.Date;

/**
 *
 * @author Wilson
 */
public interface ProductoProjection {
    
    public int getCodigo_producto();
    public String getDombre();
    public String getDescripcion();
    public float getPrecio();
    public String getEstado();
    public Date	getFechacreacion();
    public Date	getFechamodificacion();
}

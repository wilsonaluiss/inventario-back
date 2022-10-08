/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.dto;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Wilson
 */
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Data
public class ProductoDto {
    
    private String nombre;
    private String descripcion;
    private float precio;
    private String estado;
    private Date fechacreacion;
    private Date fechamodificacion;
    

    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.model;

import javax.persistence.*;
import lombok.Data;


/**
 *
 * @author pao
 */
@lombok.AllArgsConstructor
@Data
@lombok.NoArgsConstructor
@Entity
@Table(name = "inventario", schema = "public")
public class InventarioModel implements java.io.Serializable {
    
    @Id
    @Column
    private int Id_Producto;
    
    @Column
    private int Id_Bodega ;
    
    @Column 
    private String FechaModificacion ;
    
   @Column 
    private String FechaCreacion; 
    @Column
    private int Existencias ;
    
}

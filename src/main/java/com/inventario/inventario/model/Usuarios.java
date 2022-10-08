/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.model;

/**
 *
 * @author Wilson
 */

import javax.persistence.*;
import lombok.Data;
@lombok.AllArgsConstructor
@Data
@lombok.NoArgsConstructor
@Entity
@Table(name ="usuario", schema = "public")
public class Usuarios {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo_usuario;
    
    @Column
    private String nombre_usuario;
    
    @Column
    private String contraseña;
    
    @Column 
    private int codigo_rol;
    
    
}

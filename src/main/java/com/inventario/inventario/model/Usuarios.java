/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.model;

/**
 *
 * @author pao
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
    private String Id_usuario;
    
    @Column
    private String Contraseña ;
    
    @Column 
    private int Id_Rol ;
    
   @Column 
    private String Estado;
    

}

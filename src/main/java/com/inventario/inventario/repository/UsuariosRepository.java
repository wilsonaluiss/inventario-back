/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.repository;

import com.inventario.inventario.model.Usuarios;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Wilson
 */
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
    
    
    @Query(value= "select * from usuario u where u.nombre_usuario = :usuario and u.contraseña = :contraseña", nativeQuery = true )
    Optional<Usuarios> usuarios (@Param ("usuario")String usuario, @Param ("contraseña")String contraseña);
    
}

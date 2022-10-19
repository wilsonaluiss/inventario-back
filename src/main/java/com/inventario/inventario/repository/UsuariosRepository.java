/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventario.inventario.repository;

import com.inventario.inventario.model.Usuarios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author pao
 */
public interface UsuariosRepository extends JpaRepository<Usuarios, String> {
    
    
    @Query(value= "select * from usuario u where u.Id_Usuario =:usuario and u.contraseña =:contraseña", nativeQuery = true )
    Optional<Usuarios>   LoginUsuario (@Param ("usuario")String usuario, @Param ("contraseña")String contraseña);
    
}

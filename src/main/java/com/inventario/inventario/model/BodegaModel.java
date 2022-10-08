/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Builder;

/**
 *
 * @author Wilson
 */
@Entity
@Builder
@Table(name = "bodega", schema = "public")
public class BodegaModel implements java.io.Serializable{
    
    private int codigoBodega;
    private String nombre;
    private String direccion;
    private String estado;
    private Date fechacreacion;
    private Date fechamodificacion;

    public BodegaModel() {
    }

    public BodegaModel(int codigoBodega, String nombre, String direccion, String estado, Date fechacreacion, Date fechamodificacion) {
        this.codigoBodega = codigoBodega;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
        this.fechacreacion = fechacreacion;
        this.fechamodificacion = fechamodificacion;
    }

    
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "codigo_bodega", unique = true, nullable = false)
    public int getCodigoBodega() {
        return codigoBodega;
    }

    public void setCodigoBodega(int codigoBodega) {
        this.codigoBodega = codigoBodega;
    }

    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechacreacion")
    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechamodificacion")
    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    
    
    
    
    
}

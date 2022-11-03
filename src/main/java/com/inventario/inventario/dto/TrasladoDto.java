/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.dto;

/**
 *
 * @author pao
 */
public class TrasladoDto {
    private int IdBodegaOrigen;
    private int IdBodegaDestino;
    private int IdProducto;
    private int Cantidad;

    public TrasladoDto(int IdBodegaOrigen, int IdBodegaDestino, int IdProducto, int Cantidad) {
        this.IdBodegaOrigen = IdBodegaOrigen;
        this.IdBodegaDestino = IdBodegaDestino;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
    }

    public int getIdBodegaOrigen() {
        return IdBodegaOrigen;
    }

    public void setIdBodegaOrigen(int IdBodegaOrigen) {
        this.IdBodegaOrigen = IdBodegaOrigen;
    }

    public int getIdBodegaDestino() {
        return IdBodegaDestino;
    }

    public void setIdBodegaDestino(int IdBodegaDestino) {
        this.IdBodegaDestino = IdBodegaDestino;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public String toString(){
        return "obj: " + this.IdBodegaOrigen + ","+this.IdBodegaOrigen+","+this.IdProducto+","+this.Cantidad;
    }
    
}

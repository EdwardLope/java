package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombreProducto",nullable = false,length = 50)
    private String nombreProducto;
    @Column(name = "referencia",nullable = false,length = 25)
    private String referencia;
    @Column(name = "talla",nullable = false,length = 10)
    private String talla;
    @Column(name = "fotografia",nullable = false,length = 254)
    private String fotografia;
    @Column(name = "cantidadBodega",nullable = false)
    private Integer cantidadBodega;
    @Column(name = "precioUnitario",nullable = false)
    private Integer precioUnitario;
    @Column(name = "descripcion",nullable = true,length = 500)
    private String descripcion;


    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String referencia, String talla, Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public Integer getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(Integer cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

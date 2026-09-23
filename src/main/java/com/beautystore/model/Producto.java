package com.beautystore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

/**
 * Entidad que representa un producto de Beauty Store.
 *
 * Esta clase se relaciona con la tabla "productos" de la base de datos
 * mediante JPA y contiene las validaciones básicas de los datos.
 */
@Entity
@Table(name = "productos")
public class Producto {

    /**
     * Identificador único del producto.
     * Su valor es generado automáticamente por la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del producto.
     * No puede estar vacío.
     */
    @NotBlank(message = "El nombre del producto es obligatorio")
    private String nombre;

    /**
     * Precio del producto.
     * Debe ser un valor mayor que cero.
     */
    @Positive(message = "El precio debe ser mayor que 0")
    private Double precio;

    /**
     * Cantidad disponible del producto.
     * No puede ser un valor negativo.
     */
    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stock;

    /**
     * Constructor vacío requerido por JPA.
     */
    public Producto() {
    }

    /**
     * Constructor utilizado para crear productos con sus datos principales.
     */
    public Producto(Long id, String nombre, Double precio, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
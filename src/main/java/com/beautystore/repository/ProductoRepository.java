package com.beautystore.repository;

import com.beautystore.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a los datos de los productos.
 *
 * Spring Data JPA proporciona automáticamente las operaciones
 * básicas de consulta, creación, actualización y eliminación.
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    /*
     * Al extender JpaRepository se dispone automáticamente de métodos como:
     *
     * findAll()   -> consultar todos los productos.
     * findById()  -> consultar un producto por su identificador.
     * save()      -> guardar o actualizar un producto.
     * deleteById() -> eliminar un producto.
     */
}
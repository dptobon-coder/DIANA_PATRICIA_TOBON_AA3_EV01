package com.beautystore.controller;

import com.beautystore.model.Producto;
import com.beautystore.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarProducto(@PathVariable Long id) {
        return productoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Producto> crearProducto(
            @Valid @RequestBody Producto producto) {

        return ResponseEntity.ok(productoService.guardar(producto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(
            @PathVariable Long id,
            @Valid @RequestBody Producto producto) {

        return productoService.buscarPorId(id)
                .map(productoExistente -> {
                    productoExistente.setNombre(producto.getNombre());
                    productoExistente.setPrecio(producto.getPrecio());
                    productoExistente.setStock(producto.getStock());

                    return ResponseEntity.ok(
                            productoService.guardar(productoExistente)
                    );
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {

        if (productoService.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        productoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
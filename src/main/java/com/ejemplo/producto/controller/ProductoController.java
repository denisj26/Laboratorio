package com.ejemplo.producto.controller;

import com.ejemplo.producto.model.Producto;
import com.ejemplo.producto.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // GET: listar productos
    @GetMapping
    public List<Producto> obtenerTodos() {
        return productoService.listarProductos();
    }

    // POST: agregar producto
    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }
}

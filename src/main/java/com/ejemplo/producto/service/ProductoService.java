package com.ejemplo.producto.service;

import com.ejemplo.producto.model.Producto;
import com.ejemplo.producto.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    public Producto guardarProducto(Producto producto) {
    return productoRepository.save(producto);
}
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
}
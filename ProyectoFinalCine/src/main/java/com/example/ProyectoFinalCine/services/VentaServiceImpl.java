package com.example.ProyectoFinalCine.services;

import com.example.ProyectoFinalCine.entities.Venta;
import com.example.ProyectoFinalCine.repositories.BaseRepository;
import com.example.ProyectoFinalCine.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio para la entidad {@link Venta}.
 *
 * <p>Extiende de {@link BaseServiceImpl} para reutilizar la lógica genérica
 * de operaciones CRUD e implementa {@link VentaService} para definir
 * el comportamiento del servicio de ventas.</p>
 */
@Service
public class VentaServiceImpl extends BaseServiceImpl<Venta, Long> implements VentaService {

    /**
     * Repositorio específico de Venta para operaciones adicionales si fueran necesarias.
     */
    @Autowired
    private VentaRepository ventaRepository;

    /**
     * Constructor que inyecta el repositorio base.
     *
     * @param baseRepository repositorio genérico utilizado por la clase base.
     */
    public VentaServiceImpl(BaseRepository<Venta, Long> baseRepository) {
        super(baseRepository);
    }
}

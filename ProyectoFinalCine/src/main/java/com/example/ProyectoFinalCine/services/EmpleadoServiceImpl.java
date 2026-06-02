package com.example.ProyectoFinalCine.services;

import com.example.ProyectoFinalCine.entities.Empleado;
import com.example.ProyectoFinalCine.repositories.BaseRepository;
import com.example.ProyectoFinalCine.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio para la entidad {@link Empleado}.
 *
 * <p>Extiende de {@link BaseServiceImpl} para reutilizar la lógica genérica
 * de operaciones CRUD e implementa {@link EmpleadoService} para definir
 * el comportamiento del servicio de empleados.</p>
 */
@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado, Long> implements EmpleadoService {

    /**
     * Repositorio específico de Empleado para operaciones adicionales si fueran necesarias.
     */
    @Autowired
    private EmpleadoRepository empleadoRepository;

    /**
     * Constructor que inyecta el repositorio base.
     *
     * @param baseRepository repositorio genérico utilizado por la clase base.
     */
    public EmpleadoServiceImpl(BaseRepository<Empleado, Long> baseRepository) {
        super(baseRepository);
    }
}
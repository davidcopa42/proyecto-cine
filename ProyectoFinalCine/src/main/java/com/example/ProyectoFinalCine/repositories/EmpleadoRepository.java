package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Empleado;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Empleado}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de empleados dentro del sistema del cine.</p>
 */
@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado,Long>{
}

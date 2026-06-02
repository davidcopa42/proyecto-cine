package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Funcion;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Funcion}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de funciones dentro del sistema del cine.</p>
 */
@Repository
public interface FuncionRepository extends BaseRepository<Funcion,Long>{
}

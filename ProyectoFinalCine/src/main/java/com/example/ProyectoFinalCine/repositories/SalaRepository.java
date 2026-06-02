package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Sala;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Sala}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de salas dentro del sistema del cine.</p>
 */
@Repository
public interface SalaRepository extends BaseRepository<Sala,Long>{
}

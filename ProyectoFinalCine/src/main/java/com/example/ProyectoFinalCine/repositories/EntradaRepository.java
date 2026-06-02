package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Entrada;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Entrada}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de entradas dentro del sistema del cine.</p>
 */
@Repository
public interface EntradaRepository extends BaseRepository<Entrada,Long> {
}

package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Pelicula;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Pelicula}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de películas dentro del sistema del cine.</p>
 */
@Repository
public interface PeliculaRepository extends BaseRepository<Pelicula,Long>{
}

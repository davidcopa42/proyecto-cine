package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Cine}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas y permitiendo la interacción con la base de datos para la
 * entidad Cine.</p>
 */
@Repository
public interface CineRepository extends BaseRepository<Cine,Long> {

}

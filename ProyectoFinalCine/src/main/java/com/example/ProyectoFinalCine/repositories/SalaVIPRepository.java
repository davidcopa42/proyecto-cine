package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.SalaVIP;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link SalaVIP}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de salas VIP dentro del sistema del cine.</p>
 */
@Repository
public interface SalaVIPRepository extends BaseRepository<SalaVIP,Long>{
}

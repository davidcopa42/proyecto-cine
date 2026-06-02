package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Cliente;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Cliente}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de clientes dentro del sistema.</p>
 */
@Repository
public interface ClienteRepository extends BaseRepository<Cliente,Long>{
}

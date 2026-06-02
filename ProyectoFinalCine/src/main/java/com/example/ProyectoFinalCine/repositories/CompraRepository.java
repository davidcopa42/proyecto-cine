package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Compra;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Compra}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de compras dentro del sistema del cine.</p>
 */
@Repository
public interface CompraRepository extends BaseRepository<Compra,Long>{
}

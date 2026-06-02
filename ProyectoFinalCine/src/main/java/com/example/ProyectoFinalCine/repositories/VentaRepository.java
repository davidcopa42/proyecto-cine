package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Venta;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Venta}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de ventas dentro del sistema del cine.</p>
 */
@Repository
public interface VentaRepository extends BaseRepository<Venta, Long>{
}

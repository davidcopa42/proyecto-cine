package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Pago;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a datos de la entidad {@link Pago}.
 *
 * <p>Extiende de {@link BaseRepository}, heredando las operaciones CRUD
 * básicas para la gestión de pagos dentro del sistema del cine.</p>
 */
@Repository
public interface PagoRepository extends BaseRepository<Pago,Long> {
}

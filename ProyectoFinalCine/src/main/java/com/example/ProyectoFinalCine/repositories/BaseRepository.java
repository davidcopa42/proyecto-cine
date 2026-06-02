package com.example.ProyectoFinalCine.repositories;

import com.example.ProyectoFinalCine.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Repositorio base genérico que extiende JpaRepository.
 *
 * <p>Proporciona operaciones CRUD estándar para todas las entidades
 * del sistema que hereden de {@link Base}, evitando la necesidad de
 * repetir código en cada repositorio específico.</p>
 *
 * @param <E> tipo de entidad que extiende de Base.
 * @param <ID> tipo del identificador de la entidad.
 */
@NoRepositoryBean
public interface BaseRepository<E extends Base, ID extends Serializable>
        extends JpaRepository<E, ID> {
}

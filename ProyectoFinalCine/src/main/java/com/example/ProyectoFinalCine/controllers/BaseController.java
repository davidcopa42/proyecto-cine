package com.example.ProyectoFinalCine.controllers;

import com.example.ProyectoFinalCine.entities.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

/**
 * Interfaz genérica que define las operaciones CRUD básicas para los controladores
 * de la aplicación.
 *
 * @param <E> tipo de entidad que extiende de {@link Base}.
 * @param <ID> tipo de dato utilizado como identificador de la entidad.
 */
public interface BaseController<E extends Base, ID extends Serializable> {

    /**
     * Obtiene todos los registros de la entidad.
     *
     * @return respuesta HTTP con la lista completa de entidades.
     */
    ResponseEntity<?> getAll();

    /**
     * Obtiene todos los registros de la entidad utilizando paginación.
     *
     * @param pageable configuración de paginación.
     * @return respuesta HTTP con los registros paginados.
     */
    ResponseEntity<?> getAll(Pageable pageable);

    /**
     * Obtiene una entidad a partir de su identificador.
     *
     * @param id identificador de la entidad.
     * @return respuesta HTTP con la entidad encontrada.
     */
    ResponseEntity<?> getOne(@PathVariable ID id);

    /**
     * Guarda una nueva entidad.
     *
     * @param entity entidad a persistir.
     * @return respuesta HTTP con la entidad creada.
     */
    ResponseEntity<?> save(@RequestBody E entity);

    /**
     * Actualiza una entidad existente.
     *
     * @param id identificador de la entidad a actualizar.
     * @param entity entidad con los nuevos datos.
     * @return respuesta HTTP con la entidad actualizada.
     */
    ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    /**
     * Elimina una entidad según su identificador.
     *
     * @param id identificador de la entidad a eliminar.
     * @return respuesta HTTP indicando el resultado de la operación.
     */
    ResponseEntity<?> delete(@PathVariable ID id);
}

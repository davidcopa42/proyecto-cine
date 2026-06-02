package com.example.ProyectoFinalCine.services;

import com.example.ProyectoFinalCine.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * Interfaz base que define las operaciones de negocio genéricas
 * para todas las entidades del sistema.
 *
 * <p>Proporciona métodos CRUD estándar que serán implementados
 * por los servicios concretos.</p>
 *
 * @param <E> tipo de entidad que extiende de {@link Base}.
 * @param <ID> tipo del identificador de la entidad.
 */
public interface BaseService<E extends Base, ID extends Serializable> {
    /**
     * Obtiene todas las entidades registradas.
     *
     * @return lista de entidades.
     * @throws Exception si ocurre un error durante la consulta.
     */
    public List<E> findAll() throws Exception;
    /**
     * Obtiene todas las entidades de forma paginada.
     *
     * @param pageable configuración de paginación.
     * @return página de entidades.
     * @throws Exception si ocurre un error durante la consulta.
     */
    public Page<E> findAll(Pageable pageable) throws Exception;
    /**
     * Busca una entidad por su identificador.
     *
     * @param id identificador de la entidad.
     * @return entidad encontrada.
     * @throws Exception si ocurre un error o no se encuentra la entidad.
     */
    public E findById(ID id) throws Exception;
    /**
     * Guarda una nueva entidad.
     *
     * @param entity entidad a persistir.
     * @return entidad guardada.
     * @throws Exception si ocurre un error durante el guardado.
     */
    public E save(E entity) throws Exception;
    /**
     * Actualiza una entidad existente.
     *
     * @param id identificador de la entidad a actualizar.
     * @param entity datos nuevos de la entidad.
     * @return entidad actualizada.
     * @throws Exception si ocurre un error durante la actualización.
     */
    public E update(ID id, E entity) throws Exception;
    /**
     * Elimina una entidad por su identificador.
     *
     * @param id identificador de la entidad a eliminar.
     * @return true si la eliminación fue exitosa, false en caso contrario.
     * @throws Exception si ocurre un error durante la eliminación.
     */
    public boolean delete(ID id) throws Exception;
}

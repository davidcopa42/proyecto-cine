package com.example.ProyectoFinalCine.services;

import com.example.ProyectoFinalCine.entities.Base;
import com.example.ProyectoFinalCine.entities.Cine;
import com.example.ProyectoFinalCine.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Implementación genérica de la lógica de negocio base para todas las entidades.
 *
 * <p>Proporciona una implementación estándar de las operaciones CRUD utilizando
 * un {@link BaseRepository}, evitando la repetición de código en los servicios
 * concretos.</p>
 *
 * @param <E> tipo de entidad que extiende de {@link Base}.
 * @param <ID> tipo del identificador de la entidad.
 */
public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    /**
     * Repositorio genérico utilizado para acceder a la base de datos.
     */
    protected BaseRepository<E,ID> baseRepository;
    /**
     * Constructor que inyecta el repositorio base.
     *
     * @param baseRepository repositorio específico de la entidad.
     */
    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
    /**
     * Obtiene todas las entidades registradas.
     */
    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    /**
     * Obtiene las entidades de forma paginada.
     */
    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{
        try {
            Page<E> entities = baseRepository.findAll(pageable);
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    /**
     * Busca una entidad por su ID.
     */
    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    /**
     * Guarda una nueva entidad en la base de datos.
     */
    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    /**
     * Actualiza una entidad existente.
     *
     * <p>Busca la entidad por ID y luego la reemplaza con los nuevos datos.</p>
     */
    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    /**
     * Elimina una entidad por su ID.
     */
    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

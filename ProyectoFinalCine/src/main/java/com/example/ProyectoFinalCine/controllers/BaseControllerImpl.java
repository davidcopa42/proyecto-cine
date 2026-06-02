package com.example.ProyectoFinalCine.controllers;

import com.example.ProyectoFinalCine.entities.Base;
import com.example.ProyectoFinalCine.entities.Cine;
import com.example.ProyectoFinalCine.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * Implementación base de los controladores REST de la aplicación.
 *
 * <p>Proporciona las operaciones CRUD genéricas utilizando los servicios
 * correspondientes. Las clases controladoras concretas heredan de esta
 * implementación para reutilizar la lógica común.</p>
 *
 * @param <E> tipo de entidad gestionada por el controlador.
 * @param <S> tipo de servicio asociado a la entidad.
 */
public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>>
        implements BaseController<E, Long> {

    /**
     * Servicio encargado de la lógica de negocio y acceso a datos.
     */
    @Autowired
    protected S servicio;

    /**
     * Obtiene todos los registros de la entidad.
     *
     * @return respuesta HTTP con la lista de entidades.
     */
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }

    /**
     * Obtiene los registros de la entidad de forma paginada.
     *
     * @param pageable configuración de paginación.
     * @return respuesta HTTP con los resultados paginados.
     */
    @GetMapping("/paged")
    public ResponseEntity<?> getAll(Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }

    /**
     * Busca una entidad por su identificador.
     *
     * @param id identificador de la entidad.
     * @return respuesta HTTP con la entidad encontrada.
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }

    /**
     * Guarda una nueva entidad.
     *
     * @param entity entidad a almacenar.
     * @return respuesta HTTP con la entidad creada.
     */
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }

    /**
     * Actualiza una entidad existente.
     *
     * @param id identificador de la entidad a actualizar.
     * @param entity entidad con los nuevos datos.
     * @return respuesta HTTP con la entidad actualizada.
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }

    /**
     * Elimina una entidad por su identificador.
     *
     * @param id identificador de la entidad a eliminar.
     * @return respuesta HTTP indicando el resultado de la operación.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
}

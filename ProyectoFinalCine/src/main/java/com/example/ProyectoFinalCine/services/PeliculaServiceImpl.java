package com.example.ProyectoFinalCine.services;

import com.example.ProyectoFinalCine.entities.Pelicula;
import com.example.ProyectoFinalCine.repositories.BaseRepository;
import com.example.ProyectoFinalCine.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio para la entidad {@link Pelicula}.
 *
 * <p>Extiende de {@link BaseServiceImpl} para reutilizar la lógica genérica
 * de operaciones CRUD e implementa {@link PeliculaService} para definir
 * el comportamiento del servicio de películas.</p>
 */
@Service
public class PeliculaServiceImpl extends BaseServiceImpl<Pelicula, Long> implements PeliculaService {

    /**
     * Repositorio específico de Pelicula para operaciones adicionales si fueran necesarias.
     */
    @Autowired
    private PeliculaRepository peliculaRepository;

    /**
     * Constructor que inyecta el repositorio base.
     *
     * @param baseRepository repositorio genérico utilizado por la clase base.
     */
    public PeliculaServiceImpl(BaseRepository<Pelicula, Long> baseRepository) {
        super(baseRepository);
    }
}
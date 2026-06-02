package com.example.ProyectoFinalCine.services;

import com.example.ProyectoFinalCine.entities.Cine;
import com.example.ProyectoFinalCine.repositories.BaseRepository;
import com.example.ProyectoFinalCine.repositories.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio de la entidad {@link Cine}.
 *
 * <p>Extiende de {@link BaseServiceImpl} para reutilizar la lógica genérica
 * de negocio y acceso a datos, e implementa {@link CineService} para
 * definir el comportamiento específico de la entidad Cine.</p>
 */
@Service
public class CineServiceImpl extends BaseServiceImpl<Cine, Long> implements CineService {

    /**
     * Repositorio específico de Cine utilizado para operaciones adicionales
     * si fueran necesarias.
     */
    @Autowired
    private CineRepository cineRepository;

    /**
     * Constructor que inyecta el repositorio base.
     *
     * @param baseRepository repositorio genérico utilizado por la implementación base.
     */
    public CineServiceImpl(BaseRepository<Cine, Long> baseRepository) {
        super(baseRepository);
    }
}
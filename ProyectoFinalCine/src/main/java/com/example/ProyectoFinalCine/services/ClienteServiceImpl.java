package com.example.ProyectoFinalCine.services;

import com.example.ProyectoFinalCine.entities.Cliente;
import com.example.ProyectoFinalCine.repositories.BaseRepository;
import com.example.ProyectoFinalCine.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio para la entidad {@link Cliente}.
 *
 * <p>Extiende de {@link BaseServiceImpl} para reutilizar la lógica genérica
 * de operaciones CRUD e implementa {@link ClienteService} para definir
 * el comportamiento del servicio de clientes.</p>
 */
@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService {

    /**
     * Repositorio específico de Cliente para operaciones adicionales si fueran necesarias.
     */
    @Autowired
    private ClienteRepository clienteRepository;

    /**
     * Constructor que inyecta el repositorio base.
     *
     * @param baseRepository repositorio genérico utilizado por la clase base.
     */
    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
        super(baseRepository);
    }
}
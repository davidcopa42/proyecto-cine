package com.example.ProyectoFinalCine.controllers;

import com.example.ProyectoFinalCine.entities.Cliente;
import com.example.ProyectoFinalCine.services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST encargado de gestionar las operaciones relacionadas
 * con los clientes del sistema.
 *
 * <p>Hereda las operaciones CRUD básicas de {@link BaseControllerImpl},
 * permitiendo crear, consultar, actualizar y eliminar registros de
 * la entidad {@link Cliente}.</p>
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl>{
}

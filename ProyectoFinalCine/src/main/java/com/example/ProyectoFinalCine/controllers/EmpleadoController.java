package com.example.ProyectoFinalCine.controllers;

import com.example.ProyectoFinalCine.entities.Empleado;
import com.example.ProyectoFinalCine.services.EmpleadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST encargado de gestionar las operaciones relacionadas
 * con los empleados del sistema.
 *
 * <p>Hereda las operaciones CRUD básicas de {@link BaseControllerImpl},
 * permitiendo crear, consultar, actualizar y eliminar registros de
 * la entidad {@link Empleado}.</p>
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/empleados")
public class EmpleadoController extends BaseControllerImpl<Empleado, EmpleadoServiceImpl>{
}

package com.example.ProyectoFinalCine.controllers;

import com.example.ProyectoFinalCine.entities.Cine;
import com.example.ProyectoFinalCine.services.CineServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST encargado de gestionar las operaciones relacionadas
 * con los cines del sistema.
 *
 * <p>Hereda las operaciones CRUD básicas de {@link BaseControllerImpl},
 * permitiendo crear, consultar, actualizar y eliminar registros de
 * la entidad {@link Cine}.</p>
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/cines")
public class CineController extends BaseControllerImpl<Cine, CineServiceImpl> {

}

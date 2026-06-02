package com.example.ProyectoFinalCine.controllers;

import com.example.ProyectoFinalCine.entities.Pelicula;
import com.example.ProyectoFinalCine.services.PeliculaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST encargado de gestionar las operaciones relacionadas
 * con las películas del sistema.
 *
 * <p>Hereda las operaciones CRUD básicas de {@link BaseControllerImpl},
 * permitiendo crear, consultar, actualizar y eliminar registros de
 * la entidad {@link Pelicula}.</p>
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/peliculas")
public class PeliculaController extends BaseControllerImpl<Pelicula, PeliculaServiceImpl>{
}

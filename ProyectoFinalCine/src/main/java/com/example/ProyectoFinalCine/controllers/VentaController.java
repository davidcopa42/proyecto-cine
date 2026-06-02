package com.example.ProyectoFinalCine.controllers;

import com.example.ProyectoFinalCine.entities.Venta;
import com.example.ProyectoFinalCine.services.VentaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST encargado de gestionar las operaciones relacionadas
 * con las ventas del sistema.
 *
 * <p>Hereda las operaciones CRUD básicas de {@link BaseControllerImpl},
 * permitiendo crear, consultar, actualizar y eliminar registros de
 * la entidad {@link Venta}.</p>
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ventas")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl>{
}

package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Clase base para todas las entidades persistentes del sistema.
 *
 * <p>Proporciona un identificador único generado automáticamente
 * y permite reutilizar esta estructura común en las entidades que
 * heredan de ella.</p>
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable {

    /**
     * Identificador único de la entidad.
     * Se genera automáticamente mediante estrategia IDENTITY.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
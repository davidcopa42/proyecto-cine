package com.example.ProyectoFinalCine.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa un empleado que trabaja en un cine.
 *
 * <p>Almacena información básica de identificación del empleado
 * y mantiene una relación con el cine al que pertenece.</p>
 */
@Entity
@Table(name = "empleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Empleado extends Base {

    /**
     * Nombre completo del empleado.
     */
    @Column(name = "nombre")
    private String nombre;

    /**
     * Documento Nacional de Identidad del empleado.
     */
    @Column(name = "dni")
    private int dni;

    /**
     * Cine al que pertenece el empleado.
     */
    @ManyToOne
    @JoinColumn(name = "fk_cine")
    @JsonBackReference
    private Cine cine;
}

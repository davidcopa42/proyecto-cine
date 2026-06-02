package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una función de cine programada para la proyección
 * de una película en un horario determinado.
 *
 * <p>Cada función está asociada a una película y dispone de una
 * colección de entradas que permiten el acceso a la proyección.</p>
 */
@Entity
@Table(name = "funcion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Funcion extends Base {

    /**
     * Horario en el que se proyecta la función.
     */
    @Column(name = "horario")
    private String horario;

    /**
     * Película proyectada durante la función.
     */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pelicula")
    private Pelicula pelicula;

    /**
     * Entradas disponibles o asociadas a la función.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_funcion")
    private List<Entrada> entradas = new ArrayList<>();
}

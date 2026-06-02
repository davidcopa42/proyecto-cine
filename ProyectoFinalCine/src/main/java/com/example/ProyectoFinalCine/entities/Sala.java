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
 * Representa una sala de cine dentro del sistema.
 *
 * <p>Contiene información básica como número de sala y capacidad,
 * además de las funciones que se proyectan en ella.</p>
 */
@Entity
@Table(name = "sala")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Sala extends Base {

    /**
     * Número identificador de la sala.
     */
    @Column(name = "numero")
    protected int numero;

    /**
     * Capacidad máxima de la sala (cantidad de espectadores).
     */
    @Column(name = "capacidad")
    protected int capacidad;

    /**
     * Funciones asignadas a la sala.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_sala")
    private List<Funcion> funciones = new ArrayList<>();
}

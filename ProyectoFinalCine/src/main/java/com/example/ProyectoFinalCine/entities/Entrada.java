package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa una entrada para una función de cine.
 *
 * <p>Cada entrada posee un precio y un asiento asignado,
 * permitiendo identificar la ubicación reservada dentro
 * de la sala.</p>
 */
@Entity
@Table(name = "entrada")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Entrada extends Base {

    /**
     * Precio de la entrada.
     */
    @Column(name = "precio")
    private double precio;

    /**
     * Identificador del asiento asignado a la entrada.
     */
    @Column(name = "asiento")
    private String asiento;
}

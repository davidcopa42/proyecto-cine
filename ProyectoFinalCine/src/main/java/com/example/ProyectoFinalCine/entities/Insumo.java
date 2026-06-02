package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa un insumo utilizado o adquirido por el cine.
 *
 * <p>Los insumos pueden ser productos o recursos con un nombre
 * y un precio asociado, utilizados en distintas operaciones
 * del sistema.</p>
 */
@Entity
@Table(name = "insumo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Insumo extends Base {

    /**
     * Nombre del insumo.
     */
    @Column(name = "nombre")
    private String nombre;

    /**
     * Precio del insumo.
     */
    @Column(name = "precio")
    private double precio;
}

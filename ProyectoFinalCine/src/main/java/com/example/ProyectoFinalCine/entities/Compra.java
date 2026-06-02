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
 * Representa una compra realizada por el cine para adquirir
 * insumos a uno o más proveedores.
 *
 * <p>Una compra registra la fecha de realización y mantiene
 * las relaciones con los insumos adquiridos y los proveedores
 * involucrados en la operación.</p>
 */
@Entity
@Table(name = "compra")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Compra extends Base {

    /**
     * Fecha en la que se realizó la compra.
     */
    @Column(name = "fecha")
    private String fecha;

    /**
     * Lista de insumos incluidos en la compra.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_compra")
    private List<Insumo> insumos = new ArrayList<>();

    /**
     * Lista de proveedores asociados a la compra.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_compra")
    private List<Proveedor> proveedores = new ArrayList<>();
}

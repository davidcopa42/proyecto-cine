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
 * Representa una venta realizada en el sistema del cine.
 *
 * <p>Una venta contiene la fecha en la que se realizó, el pago asociado,
 * los clientes involucrados y las funciones adquiridas.</p>
 */
@Entity
@Table(name = "venta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Venta extends Base {

    /**
     * Fecha en la que se realizó la venta.
     */
    @Column(name = "fecha")
    private String fecha;

    /**
     * Pago asociado a la venta.
     */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pago")
    private Pago pago;

    /**
     * Clientes asociados a la venta.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_venta")
    private List<Cliente> clientes = new ArrayList<>();

    /**
     * Funciones incluidas en la venta.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_venta")
    private List<Funcion> funciones = new ArrayList<>();
}

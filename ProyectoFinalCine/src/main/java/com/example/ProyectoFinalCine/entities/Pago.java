package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa un pago realizado dentro del sistema.
 *
 * <p>Contiene el monto abonado y el tipo de pago utilizado
 * (por ejemplo, efectivo o tarjeta).</p>
 */
@Entity
@Table(name = "pago")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Pago extends Base {

    /**
     * Monto total del pago realizado.
     */
    @Column(name = "monto")
    private double monto;

    /**
     * Tipo de pago utilizado en la transacción.
     */
    @Enumerated(EnumType.STRING)
    private TipoPago tipo;
}

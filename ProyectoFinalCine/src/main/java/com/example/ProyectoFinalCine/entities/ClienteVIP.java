package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa un cliente VIP del sistema.
 *
 * <p>Extiende la entidad {@link Cliente} incorporando un porcentaje
 * de descuento exclusivo que puede aplicarse en compras o beneficios
 * especiales del cine.</p>
 */
@Entity
@Table(name = "cliente_vip")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class ClienteVIP extends Cliente {

    /**
     * Porcentaje de descuento asignado al cliente VIP.
     */
    @Column(name = "descuento")
    private float descuento;
}

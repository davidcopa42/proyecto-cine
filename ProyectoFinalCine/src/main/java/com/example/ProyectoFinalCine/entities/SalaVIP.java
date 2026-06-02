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
 * Representa una sala VIP del cine.
 *
 * <p>Extiende la clase {@link Sala} incorporando beneficios adicionales
 * exclusivos para este tipo de sala, como servicios especiales o
 * comodidades extra.</p>
 */
@Entity
@Table(name = "sala_vip")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class SalaVIP extends Sala {

    /**
     * Beneficios o servicios adicionales que ofrece la sala VIP.
     */
    @Column(name = "beneficios")
    private String beneficios;
}

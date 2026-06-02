package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa una película disponible en el sistema.
 *
 * <p>Contiene información básica como el título y el género,
 * y puede aplicar una promoción de descuento definida por la
 * implementación de {@link IPromocion}.</p>
 */
@Entity
@Table(name = "pelicula")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Pelicula extends Base implements IPromocion {

    /**
     * Título de la película.
     */
    @Column(name = "titulo")
    private String titulo;

    /**
     * Género cinematográfico de la película.
     */
    @Enumerated(EnumType.STRING)
    private Genero genero;

    /**
     * Obtiene el descuento aplicado a la película.
     *
     * @return porcentaje de descuento fijo (15%).
     */
    @Override
    public float obtenerDescuento() {
        return 15;
    }
}

package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa un cliente registrado en el sistema.
 *
 * <p>Almacena los datos básicos de identificación y contacto
 * de una persona que realiza compras o adquiere entradas
 * dentro del cine.</p>
 */
@Entity
@Table(name = "cliente")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Cliente extends Base {

    /**
     * Nombre completo del cliente.
     */
    @Column(name = "nombre")
    protected String nombre;

    /**
     * Dirección de correo electrónico del cliente.
     */
    @Column(name = "email")
    protected String email;
}
